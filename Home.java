/*	Author: Willard Laxton	*/

import java.util.Scanner;

public class Home 
{
	private int square_Feet;
	private String home_Type;
	private int bedrooms;
	private double bathrooms;
	private double template_Base_Rate;
	private int extra_Bedrooms;
	private double extra_Bathrooms;
	private double tax;
	private double total_Cost;
	  	
  	public Home(int square_Feet, String home_Type, int bedrooms, double bathrooms, double template_Base_Rate, int extra_Bedrooms, double extra_Bathrooms, double tax, double total_Cost)
  	{
  		this.square_Feet = square_Feet;
  		this.home_Type = home_Type;
  		this.bedrooms = bedrooms;
  		this.bathrooms = bathrooms;
  		this.template_Base_Rate = template_Base_Rate;
  		this.extra_Bedrooms = extra_Bedrooms;
  		this.extra_Bathrooms = extra_Bathrooms;
  		this.tax = tax;
  		this.total_Cost = total_Cost;
  	}

	Scanner input = new Scanner(System.in);
	
	public void set_House_Type()
	{
		System.out.println("Please choose a house type.\nTraditional\nModern");
		System.out.println("European\nSouthwest\nMountain\nVictorian\nCountry");
		home_Type = input.next();
			
		switch(home_Type)
		{
			case "Traditional":
			case "traditional":
				System.out.println("You choose Traditional.\n");
				square_Feet = 2000;
				bedrooms = 3;
				bathrooms = 2;
				template_Base_Rate = 3300;
							
				System.out.println("Your square footage is " + square_Feet + ".");
				System.out.println("The number of bedrooms is " + bedrooms + ".");
				System.out.println("The number of bathrooms is " + bathrooms + ".");
				System.out.println("The template cost is " + template_Base_Rate + ".\n");				
				break;
				
			case "Modern":
			case "modern":
				System.out.println("You choose Modern.\n");
				square_Feet = 2000;
				bedrooms = 2;
				bathrooms = 1.5;
				template_Base_Rate = 4200;
							
				System.out.println("Your square footage is " + square_Feet + ".");
				System.out.println("The number of bedrooms is " + bedrooms + ".");
				System.out.println("The number of bathrooms is " + bathrooms + ".");
				System.out.println("The template cost is " + template_Base_Rate + ".\n");
				break;
				
			case "European":
			case "european":
				System.out.println("You choose European.\n");
				square_Feet = 2000;
				bedrooms = 2;
				bathrooms = 2;
				template_Base_Rate = 4700;
							
				System.out.println("Your square footage is " + square_Feet + ".");
				System.out.println("The number of bedrooms is " + bedrooms + ".");
				System.out.println("The number of bathrooms is " + bathrooms + ".");
				System.out.println("The template cost is " + template_Base_Rate + ".\n");
				break;
				
			case "Southwest":
			case "southwest":
				System.out.println("You choose Southwest.\n");
				square_Feet = 2000;
				bedrooms = 3;
				bathrooms = 2;
				template_Base_Rate = 3600;
							
				System.out.println("Your square footage is " + square_Feet + ".");
				System.out.println("The number of bedrooms is " + bedrooms + ".");
				System.out.println("The number of bathrooms is " + bathrooms + ".");
				System.out.println("The template cost " + template_Base_Rate + ".\n");
				break;
				
			case "Mountain":
			case "mountain":
				System.out.println("You choose Mountain.\n");
				square_Feet = 2000;
				bedrooms = 3;
				bathrooms = 2;
				template_Base_Rate = 3500;
							
				System.out.println("Your square footage is " + square_Feet + ".");
				System.out.println("The number of bedrooms is " + bedrooms + ".");
				System.out.println("The number of bathrooms is " + bathrooms + ".");
				System.out.println("The template cost is " + template_Base_Rate + ".\n");
				break;
				
			case "Victorian":
			case "victorian":
				System.out.println("You choose Victorian.\n");
				square_Feet = 2000;
				bedrooms = 3;
				bathrooms = 2.5;
				template_Base_Rate = 3200;
							
				System.out.println("Your square footage is " + square_Feet + ".");
				System.out.println("The number of bedrooms is " + bedrooms + ".");
				System.out.println("The number of bathrooms is " + bathrooms + ".");
				System.out.println("The template cost is " + template_Base_Rate + ".\n");
				break;
				
			case "Country":
			case "country":
				System.out.println("You choose Country.\n");
				square_Feet = 2000;
				bedrooms = 3;
				bathrooms = 3;
				template_Base_Rate = 3000;
							
				System.out.println("Your square footage is " + square_Feet + ".");
				System.out.println("The number of bedrooms is " + bedrooms + ".");
				System.out.println("The number of bathrooms is " + bathrooms + ".");
				System.out.println("The template cost is " + template_Base_Rate + ".\n");
				break;	
		};
	}

	public void set_Square_Footage()
	{	
		System.out.println("The square footage for your template is " + square_Feet + " square feet. If you would like it to be bigger, ");
		System.out.println("enter the size you want now or else enter 2000. \n");
		square_Feet = input.nextInt();
		
		System.out.println("You have choosen " + get_Square_Feet() + " square feet.\n");
		
	}

	public void set_Extra_Bedrooms()
	{
		System.out.println("The number of bedrooms for your template is " + bedrooms + ". If you would like additional bedrooms, enter how many extra bedrooms now");
		System.out.println("otherwise enter 0. Keep in mind that each additional bedroom will cost $800");
		
			 extra_Bedrooms = input.nextInt();
			
		System.out.println("You have choosen " + extra_Bedrooms + " extra bedrooms.\n");
	}	
	
 	public void set_Extra_Bathrooms()
	{
		System.out.println("The number of bathrooms for your template is " + bathrooms + ". If you would like additional bathrooms, enter the number of extra bathrooms you want now.");
		System.out.println("otherwise enter 0. Keep in mind that each extra bathroom more than what is in the template will cost $500 extra per room.");
			
		extra_Bathrooms = input.nextDouble();
			
		System.out.println("You have choosen " + extra_Bathrooms + " extra bathrooms.\n");
	}	
 	
 	public void get_Cost()
 	{ 		
 		if(square_Feet >= 3000)
 		{
 			template_Base_Rate =1.5 * template_Base_Rate;
 		}
 		
 		total_Cost = ( template_Base_Rate + (800 * extra_Bedrooms) + (500 * extra_Bathrooms));
 		
 		tax = .05 * total_Cost;
 		
 		total_Cost = total_Cost + tax;
 		
 		System.out.println("The total cost before tax for your home is " + total_Cost + "\n");
 	}
 	public String to_String()
 	{
 		int total_Bed = bedrooms + extra_Bedrooms;
 		double total_Bath = bathrooms + extra_Bathrooms;
 		
 		return " Your home type is " + home_Type + "\n Your home has " + total_Bed + " bedrooms.\n Your home has " + total_Bath + " bathrooms.\n";
 	}
 	
	public int get_Square_Feet()
	{
		return square_Feet;
	}

	public String get_Home_Type()
	{
		return home_Type;
	}
	
	public int get_Bedrooms()
	{
		return bedrooms;
	}

	public double get_Bathrooms()
	{
		return bathrooms;
	}
	public int get_Extra_Bedrooms()
	{
		return extra_Bedrooms;
	}
	public double get_Extra_Bathrooms()
	{
		return extra_Bathrooms;
	}
	public double get_Total_Cost()
	{
		return total_Cost;
	}
}

	
