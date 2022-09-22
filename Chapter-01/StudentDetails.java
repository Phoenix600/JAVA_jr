import java.util.Scanner;

public class StudentDetails
{
	public static void main(String[] args)
	{
			int number_01, number_02;

			// Creating the Scanner class object to get the inpout from the user 
			Scanner input = new Scanner(System.in);

			System.out.println("[+]Enter two numbers : ");

			number_01 = input.nextInt();
			number_02 = input.nextInt();

			System.out.println("The sum of two numbers is : " + (number_01 + number_02));
	}
}

