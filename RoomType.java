package assignment2;

public class RoomType {
	//specific type of room
	private String name;
	private int regularPrice;
	private int salePrice;
	private int maximumOccupancy;
	private int numberOfRooms;
	private int numberOfVacancies;
	
	
	public RoomType ( String name, int regularPrice, int salePrice, 
			int maximunOccupancy, int numberOfRooms, int numberOfVancancies)
	{
	this.name=name;
	this.regularPrice=regularPrice;
	this.salePrice=salePrice;
	this.maximumOccupancy=maximunOccupancy;
	this.numberOfRooms=numberOfRooms;
	}
	
	public String getName(){
		return this.name;
	}
	public int getRegularPrice(){
		return this.regularPrice;
	}
    public int getSalePrice(){
	    return this.salePrice;
    }
    public void setSalePrice(int newPrice){
    	this.salePrice=newPrice;
    }
    public int getMaximunOccupancy(){
         return this.maximumOccupancy;
    }
    public int getNumberOfRooms(){
    	return this.numberOfRooms;
    }
    public int getNumberofVacancies(){
    	return this.numberOfVacancies;
    }
    @Override
	public String toString() {
		return "RoomType [name=" + name + ", regularPrice=" + regularPrice + ", maximumOccupancy=" + maximumOccupancy
				+ "]";
	}
}


