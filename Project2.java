/*	Author: Willard Laxton	*/

import java.util.Scanner;

public class Project2 {
	
	public static void main(String [] args)
	{ 
		Scanner input = new Scanner(System.in);
		
		String confirm = "n";
		
		Home house = new Home(0, null, 0, 0, 0, 0, 0, 0, 0);
		
		house.set_House_Type();
		
		while(confirm == "n")
		{
			house.set_Square_Footage();
			house.set_Extra_Bedrooms();
			house.set_Extra_Bathrooms();
			house.get_Cost();
			
			System.out.println(house.to_String());
			
			System.out.println("Are you satisfied with the specifications for your home? (y/n)\n");
			confirm = input.next();
		}
		
		
		
		
	}

}