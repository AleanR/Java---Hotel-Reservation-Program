/* NAME: Alean Rodriguez
* DATE: 03/08/2022 (Date the program was created/last modified)
* ASSIGNMENT # 4
* PROGRAM: Main.java
* DESCRIPTION: This class will create CustomerInfo Objects that will be allocated into an array for later output.
*/

public class CustomerInfo {
	//Parameters
	String Customernum;
	
	String Customername;
	
	String Customeraddress;
	
	String Customerphone;
	
	//Constructor
	CustomerInfo(String Customernum, String Customername, String Customeraddress, String Customerphone) {
		
		this.Customernum = Customernum;
		
		this.Customername = Customername;
		
		this.Customeraddress = Customeraddress;
		
		this.Customerphone = Customerphone;
		
	}
	
//toString method for output.
public String toString() {
		
		return Customernum+" "+Customername+" "+Customeraddress+" "+Customerphone;
		
	}
}
