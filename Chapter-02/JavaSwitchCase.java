// Import java classes here 
import java.util.Scanner;

public class JavaSwitchCase
{
		public static void main(String[] args)
		{
				// Create the Scanner class object to get the input from the user
				Scanner input = new Scanner(System.in);

				System.out.println("Switch cases in the java");

				int choice = -1;

				// Switch statement allows us execute a block of code among the multiple condtions 
				// for each specific case 
				// switch(expression)

				// Declare varibles here 
				float price = 0.0f;
								
				String menu = "################################################################\n" +
							  "		        JULIE PETTERSON CAFE			 \n" +
							  "################################################################" +
							  "\n| [KEY]			 [ITEMS]		[PRICE]	 	|" +
							  "\n|  1			 Pasta			 120/-   	|" +
							  "\n|  2			 Smoothie		 80/-    	|" +
							  "\n|  3			 Salsa			 170/-   	|" +
							  "\n|  4			 Pizza			 190/-   	|" +
							  "\n|  0			 Exit			         	|" +
							  "\n################################################################";

				System.out.println(menu);

				while(choice != 0)
				{
					choice = input.nextInt();
					
					switch(choice)
					{
						case 1:
								price += 120.0;
								break;
		
						case 2:
								price += 80.0;
								break;
						case 3:
								price += 170.0;
								break;
						case 4:
								price += 190.0;
								break;
						case 0 :
								System.out.println("Code has been existed....");
								break;

						default :
								System.out.println("Invalid key-binding, Have a look at the menu please");
								break;

					}
				}

				System.out.println("Thank you so much for being true to ourselves \n Your bill is $" + price + " \n");

				input.close();

		}

}
