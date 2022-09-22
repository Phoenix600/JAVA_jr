import java.util.Scanner;

public class _02_JavaTernaryOperator
{
		public static void main(String[] args)

		{
			// Declare objects here 
			int x;
			int age;
			float height;

			// create the object of Scanner Class
			Scanner input = new Scanner(System.in);
			
			x = input.nextInt();

			// #TODO:  Your should only use the ternary operator when the resulting statement is short

			System.out.println((x<0 && x!=0 ?"X is negative":(x==0)? "X is zero" : "X is non zero-element"));


			// If-else block of code can be implemeted using the ternary operators 
			age = input.nextInt();
			height = input.nextFloat();

			// if-else block representation in the ternary object
			System.out.println((age>18 && height < 120 ? "You can not ride the rollar coaster" : (age>18 && height >120)? "You can ride the rollar coaster" : "You need to wait until you are tall enough to pass the height criteria"));


			input.close();
		}
}
