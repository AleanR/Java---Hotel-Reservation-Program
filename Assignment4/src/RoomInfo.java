/* NAME: Alean Rodriguez
* DATE: 03/08/2022 (Date the program was created/last modified)
* ASSIGNMENT # 4
* PROGRAM: Main.java
* DESCRIPTION: This class will create RoomInfo Objects that will be allocated into an array for later output.
*/

public class RoomInfo {
//Parameters
	int Roomnum;
	
	//The enum RoomType is used for the RoomType aka Deluxe,Economy, Standard.
	RoomType RoomType;
	
	double Price;
	
	//Constructor
	RoomInfo (int Roomnum, RoomType RoomType, double Price){
		
	
		this.Roomnum = Roomnum;
		
		this.RoomType = RoomType;
		
		this.Price = Price;
		
		

	}
	
	
	//toString method for output
	public String toString() {
		
		return Roomnum+" "+RoomType+" "+Price;
		
	}
	
	
	
}
