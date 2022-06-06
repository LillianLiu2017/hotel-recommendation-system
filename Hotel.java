package assignment2;

import java.util.Arrays;

public class Hotel {
	         private String name;
	         private String address;
	         private int starRating;
	         private RoomType[] roomTypes;
	         // array index
	         private int room;
	         
	         //constructor

     public Hotel(String name,String address,int starRating, 
		int numberroomTypes)
{
	    this.name=name;
	    this.address=address;
	    this.starRating=starRating;
	    this.roomTypes=new RoomType[numberroomTypes];
}

    public String getName(){
	    return this.name;}

    public String getAddress(){
	    return this.address;}

    public int getStarRating(){
	    return this.starRating;}
    
    public int getRoomType(){
    	return this.roomTypes.length;}
    
    public RoomType getRoomType(int index){
    	if (index<0){
    		return null;
    	}
    	if (roomTypes!=null&& roomTypes.length<=index){
    		return null;
    	}
    	return this.roomTypes[index];
    }
    
    public boolean setRoomType(RoomType s){
    	if (room<roomTypes.length) {
    		roomTypes[room]=s;
    		room++;
    		return true;
    	}
    	return false;
    	
    }
    @Override
	public String toString() {
		return "Hotel [name=" + name + ", address=" + address + ", starRating=" + starRating + ", roomTypes="
				+ Arrays.toString(roomTypes) + "]";
	}
    }

