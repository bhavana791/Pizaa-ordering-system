package food;

import java.util.Scanner;

public class Tester {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		// Object creation
		Customer customer=new Customer();
		

		// Assigning values to the instance variables
		customer.customerID="CID101";
		customer.customerName="Bhavana";
		customer.contactNumber=1234567890;
		customer.address="ABC Sec. 26 , pune";
		
		//customer.displaycustomerDetails();
		
		Pizza bp=new Pizza(true);
		System.out.println("********************Welcome to Cafe PizzaWorld********************'"+"\n");
		
	      
	        while (true) {
	            System.out.println("Enter your choices to Order Pizza" + "\n");
	            System.out.println("\n Enter 1: Base Pizza \n Enter 2: For Extra Cheese \n Enter 3: For Extra Toppings \n Enter 4: For Bill \n Enter 5: Exit");

	            // Prompt user for pizza type (veg or non-veg)
	            System.out.println("Enter 'true' for vegetarian pizza or 'false' for non-vegetarian pizza:");
	            boolean isVegPizza = sc.nextBoolean();
                int ch;
	            do {
	                System.out.println("Enter your choice:");
	                ch = sc.nextInt();

	                switch (ch) {
	                    case 2:
	                        bp.addExtraCheese();
	                        break;
	                    case 3:
	                        bp.addExtraToppings();
	                        break;
	                    case 4:
	                        bp.getBill();
	                        break;
	                    case 5:
	                        System.out.println("Exiting PizzaWorld. Goodbye!");
	                        System.exit(0);
	                        break;
	                    default:
	                        System.out.println("Please enter a correct choice!");
	                }
	            } while (ch != 4);

	            // After displaying the bill, ask if the user wants to place another order
	            System.out.println("Do you want to place another order? (Enter 'yes' or 'no'):");
	            String anotherOrder = sc.next();

	            if (anotherOrder.equalsIgnoreCase("no")) {
	                System.out.println("Exiting PizzaWorld. Goodbye!");
	                break;
	            }
	        }
	    }
	}
