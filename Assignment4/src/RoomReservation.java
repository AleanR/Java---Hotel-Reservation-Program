/* NAME: Alean Rodriguez
* DATE: 03/08/2022 (Date the program was created/last modified)
* ASSIGNMENT # 4
* PROGRAM: Main.java
* DESCRIPTION: This class will create RoomReservation Objects that will be allocated into an array for later output.
*/

public class RoomReservation {
	//Parameters
	
	//Objects RoomInfo and CustomerInfo are added in order to represent the numbers in the objects into the RoomReservation Constructor. This is to represent that each Room Reservation has a both a Customer and a Room.
	RoomInfo Roomnum;
	
	CustomerInfo Customernum;
	
	int NumDays;
	
	int NumGuests;
	
	double TotalPrice;
	
	
	//Constructor.
	RoomReservation (RoomInfo Roomnum, CustomerInfo Customernum,int NumDays, int NumGuests){
		
		this.Roomnum = Roomnum;
		
		this.Customernum = Customernum;
		
		this.NumDays = NumDays;
		
		this.NumGuests = NumGuests;
		
		//Calculates the TotalPrice for the Room Reservation which will equate to the Number of Days a customer has and the Price of the room.
		this.TotalPrice = NumDays * Roomnum.Price;
	}
	
	//toString() method for output
public String toString() {
		
		return Roomnum+" "+Customernum+" "+NumDays+" "+NumGuests;
		
	}
	
	
}
