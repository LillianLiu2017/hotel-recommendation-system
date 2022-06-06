package assignment2;

import java.util.Scanner;

public class Driver {
	private int detailsofrooms;
	private final int detailsofhotels=4;
	Scanner a= new Scanner(System.in);
	//list hotel details
	Hotel[] list;
	private int data;
	Driver()
	{
		this.list=new Hotel[detailsofhotels];
		listhotel();
		listroom();
		
	}

	 private void listhotel(){
		 list[0]=new Hotel("El Grando", "Lakeside Drive, San Diego",3,3);
		 list[1]=new Hotel("Ivory Tower","Pinehill Road, Boston",4,3);
	     list[2]=new Hotel("Elite","Federation Drive, Washington DC",5,4);
	     list[3]=new Hotel("Fleabox Motel","Wrong Side of the Tracks Road, Cleveland",1,1);
	 }
	 
	 private void listroom(){
		 list[0].setRoomType(new RoomType("Executive studio",210,210,2,20,17));
		 list[0].setRoomType(new RoomType("Standard studio",180,180,2,30,10));
		 list[0].setRoomType(new RoomType("Family room",220,200,4,10,2));
	     list[1].setRoomType(new RoomType("Excutive studio",235,235,2,5,3));
	     list[1].setRoomType(new RoomType("Standard studio",205,205,2,12,0));
	     list[1].setRoomType(new RoomType("Super-sized family room",350,350,6,4,1));
	     list[2].setRoomType(new RoomType("Ultra-luxury suite",890,890,2,5,3));
	     list[2].setRoomType(new RoomType("Elitist Studio",1400,1400,1,1,1));
	     list[2].setRoomType(new RoomType("Penthouse Apartment",1200,1200,4,3,2));
	     list[2].setRoomType(new RoomType("Gold-plated Luxury",1799,1799,2,10,8));
	     list[3].setRoomType(new RoomType("Sardine Room",80,55,8,120,25));
	 }
	 
	 public void displayHotels(){
		 for (Hotel s:list)
			 System.out.println(s);
	 }
	 
	 public void printMAINMENU()
		{
		    System.out.println("\n");
			System.out.println("\t Welcome to the Hotel Recommendation System");
			System.out.println( );
			System.out.println("Developed by Nian Liu, student ID 30332500, for ITECH1000 Sem1 2017");
			System.out.println("\n");
			System.out.println("MAIN MENU\nPlease select an option from the menu:");
			System.out.println("1. Display all hotels\n"+
					           "2. Find cheapest room\n"+
					           "3. Set a sale price\n"+
					           "4. Find rooms matching criteria\n"+
					           "5. Exit System\n");
			
			this.data=a.nextInt();
			
	    }
	 private void MAINMENU(){
		 switch (this.data){
		 case 1: this.displayHotels();
		 break;
		 case 2: this.findcheapestroom();
	     break;
		 case 3: this.getsaleprice();
		 break;
		 case 4: System.out.println("Exit System");
		 break;
		 default:System.out.println("Value must be between 1 and 4. Please try again:");
			 
	     }
	 }
	 // find cheapest room
	 private void findcheapestroom() {
		Scanner in=new Scanner(System.in);
		RoomType minRoom=list[0].getRoomType(0);
		Hotel minHotel=list[0];
		for(Hotel h:list)
		{
			for(int i=0;i<h.getRoomType();i++)
			{
				RoomType room=h.getRoomType(i);
				if(minRoom.getSalePrice()>=room.getSalePrice())
				{
					minRoom=room;
					minHotel=h;
				}
			}
		}
	}
		// set a sale price
		private void getsaleprice() {
			 System.out.print("Setting Sale price\n");
			 System.out.println("Enter hotel name:");
			 Scanner input = new Scanner(System.in); 
			 String hotelname = input.nextLine();
			 Hotel selectHotel = null;
			 do{
				 Integer hotelNum = list.length;
				 for (int i=0;i<hotelNum;i++)
				 {
					 if (list[i].getName().equals(hotelname))
					 {
						 selectHotel = list[i];
						break;
					 }
				 }
				 if (selectHotel==null){
					 System.out.println("No hotel matches that name. Please try again.");
					 System.out.println("Enter hotel name:");
					 hotelname = input.nextLine();
				 }
			 }while(selectHotel==null);
			 
			 // list room types of hotel
			 System.out.println("1: Ultra-luxury suite");
			 System.out.println("2: Elitist Studio");
			 System.out.println("3: Penthouse Apartment");
			 System.out.println("4: Gold-plated Luxury");
			 
			 System.out.println("Enter room type number:");
			 int type = input.nextInt();
			 input.nextLine();
			 while (type<1 || type>selectHotel.getRoomType()){
				 System.out.println("Value must be between 1 and "+selectHotel.getRoomType()+". Please try again:");
				 type = input.nextInt();
				 input.nextLine();
			 }
			 RoomType selectRoom = selectHotel.getRoomType(type);
			 if (selectRoom!=null)
			 {
				 System.out.println("Regular price="+1200+" "+"Current price="+1200);
				 
				 System.out.println("Enter sale price:");
				 int newSalePrice = input.nextInt();
				 input.nextLine();
				 int minSalePrice = selectRoom.getRegularPrice()/2;
				 int maxSalePrice = selectRoom.getRegularPrice();
				 while (newSalePrice<minSalePrice || newSalePrice>maxSalePrice)
				 {
					 System.out.println("Value must be between "+minSalePrice+" and "+maxSalePrice+". Please try again:");
					 newSalePrice = input.nextInt();
					 input.nextLine();
				 }
				 selectRoom.setSalePrice(newSalePrice);
				 System.out.println("Sale price updated.");
			
			
			
			
		}
		
		
		
	}



         public void runMenuSystem(){
        	 do{
        		 this.printMAINMENU();
        		 this.MAINMENU();
        	 }
        	 while(this.data !=4);
        	 }
         }
