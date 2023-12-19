package food;

public class Customer {
	//class has a name and consists of instance variables and methods.
	public String customerID;
	public String customerName;                                           //instance variables
	public long contactNumber;
	public String address;
	
	
	public void displaycustomerDetails()                                   //method
	{
		System.out.println("Customer Details are \n********************\n");
		System.out.println("Customer ID : "+customerID);
		System.out.println("Customer Name : "+customerName);
		System.out.println("Customer Contact Number : "+contactNumber);
		System.out.println("Customer Address : "+address );
	}
	
	

}
