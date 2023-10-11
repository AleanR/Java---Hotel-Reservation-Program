
/* NAME: Alean Rodriguez
* DATE: 03/01/2022 (Date the program was created/last modified)
* ASSIGNMENT # 4
* PROGRAM: Main.java
* DESCRIPTION: This class essentially will output the 4th requirement of the assignment. It will print out the hotel's rooms, hotel's customers, and hotel's reservations using the information gathered from the 3 text files given.
*/



//The needed imports for the program

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		//Imports the CustomerInfo file.
		
		File file = new File ("CustomerInfo.txt");
		
		//Creates the main scanner.
		
		Scanner scn = null;
		
		
		//Uses the scanner to detect the CustomerInfo file and uses a try catch method in order to detect a FilenotFoundException.
		
	try {
		scn = new Scanner(file);
	} 
		catch (FileNotFoundException e) {
		e.printStackTrace();
		}
	
	//This program utilizes ArrayList in order to store the objects that are created by the 3 classes. CustomerInfo,RoomInfo,RoomReservation.
	
	ArrayList <CustomerInfo> Customers = new ArrayList <CustomerInfo>();
	
	ArrayList <RoomInfo> Rooms = new ArrayList <RoomInfo>();
	
	ArrayList <RoomReservation> RoomReservation = new ArrayList <RoomReservation>();
	
	//The first use of the scanner in order to create the CustomerInfo objects from the CustomerInfo file by using a while loop and iterating if the scanner has a next line to read.
	
	
		while (scn.hasNext()) {
		
						CustomerInfo Customer = new CustomerInfo(scn.nextLine(),scn.nextLine(),scn.nextLine(),scn.nextLine());
						//Adds value to array.
						Customers.add(Customer);
				}
	//Closes scanner.
				scn.close();	
				
	//Introduces the RoomInfo file in order to get the information of the file and turn it into RoomInfo objects.
	
	File file2 = new File ("RoomInfo.txt");
	
	
	//Try catch method to introduce the scanner to the second file and to see if there is FileNotFoundException.
	
		try {
			scn = new Scanner(file2);
		} 
			catch (FileNotFoundException e) {
			e.printStackTrace();
			}
	
		// While method used to create the Roominfo Objects.
				while (scn.hasNext()) {
		
						int v1 = scn.nextInt();
						
						//Scanner next line used to clear the queue.
						
						scn.nextLine();
						
						String v2 = scn.nextLine();
						
						double v3 = scn.nextDouble();
						
						//RoomType valueOf allows the RoomType to convert into a String.
						
						RoomInfo Room = new RoomInfo(v1,RoomType.valueOf(v2),v3);
		
						//Adds value to Array.
						Rooms.add(Room);
				}
				// Scanner closes.
				scn.close();
				
				
	//Introduces the third file for Room Reservations.
	File file3 = new File("Reservations.txt");
	
	
	//Try catch method in order to read the text file while covering the FileNotFoundException.
		try {
			scn = new Scanner(file3);
		} 
			catch (FileNotFoundException e) {
			e.printStackTrace();
			}
	
	//While method in order to create the RoomReservation objects using the RoomInfo number and the CustomerInfo number.
	
		//Iterates while the scanner has something to read.
	while(scn.hasNext()) {
		
		//Temporary variables to change inside the embedded for loops.
		RoomInfo temproom = null;
		
		String tempnext = scn.next();
		
		scn.nextLine();

		CustomerInfo tempcustomer = null;
		//This for loop gathers the String variable Roomnum from the "Rooms" array and gets the Roomnum from the object inside the array through each iteration.
		for(int j = 0; j < Rooms.size(); j++) {
			
			if(Integer.parseInt(tempnext) == Rooms.get(j).Roomnum) {
				
				temproom = Rooms.get(j);
			}
		}
		//Allows the information gathered to be on the second line of Room Reservation which will be the CustomerInfo.
		tempnext = scn.nextLine();
		//This for loop gets the Customernum from the object inside the array "Customers" in order to gather the information for the customer's number.
		for(int k = 0; k < Customers.size();k++) {
			
			if(tempnext.equals(Customers.get(k).Customernum)) {
				
				tempcustomer = Customers.get(k);
			}
		}
		//Creates the object that will go inside the array "Room Reservation".
		RoomReservation RoomRes = new RoomReservation(temproom,tempcustomer,scn.nextInt(),scn.nextInt());
		//Adds objects to array.
		RoomReservation.add(RoomRes);

}			
	//Scanner close.
			scn.close();
			
	//Below will be the main output for the assignment. It utilizes the String.format method in order to neatly organize the columns such that they line up. For loops are used in order to iterate through each array and display the information from each object.
			System.out.println("The following is the list of the hotel's rooms:");
	
			
	
			System.out.println(String.format("%-50s%-50s%-50s","Room #","Room Type","Room Price"));
	
	
	

		for(int i = 0; i < Rooms.size();i++) {
			
			System.out.println(String.format("%-50d%-50s%-50.2f",Rooms.get(i).Roomnum,Rooms.get(i).RoomType,Rooms.get(i).Price));
			
		}
	
			System.out.println();
	
			System.out.print("The following is the list of the hotel's customers:");
		
			System.out.println();
		
			System.out.println(String.format("%-50s%-50s%-50s%-50s","Customer #","Name","Address","Phone #"));
	
		for(int i = 0;i < Customers.size();i++) {
		
				
				System.out.print(String.format("%-50s%-50s%-50s%-50s",Customers.get(i).Customernum,Customers.get(i).Customername,Customers.get(i).Customeraddress,Customers.get(i).Customerphone ));
				
				System.out.println();
		
			}
	
			System.out.println();
	
			System.out.println("The following is the list of the hotel's reservations:");
	
			System.out.println(String.format("%-50s%-50s%-50s%-50s%-50s%-50s%-50s","Customer #","Name","Room #","Room Type","# of Guests","# of Days","Total Price"));
	
		for(int i = 0; i < Customers.size(); i++) {
		
					System.out.println(String.format("%-50s%-50s%-50d%-50s%-50d%-50d%-50.2f",Customers.get(i).Customernum,Customers.get(i).Customername,Rooms.get(i).Roomnum,Rooms.get(i).RoomType,RoomReservation.get(i).NumGuests,RoomReservation.get(i).NumDays,RoomReservation.get(i).TotalPrice));
			}
			
	
		
	}
}

