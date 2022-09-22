// import java classes here 
import java.util.Scanner;


// Declare and define public wrapper class here 
public class _01_JavaIfElse{
		public static void main(String[] args)
		{

				// Declare local variables here 
				int ageOfDog;
				int age;
				float height;
				float fees = 0.0f;
				boolean criteria = false;


				// Creating the Scanner class Object 
				Scanner input = new Scanner(System.in);

				System.out.print("[+]Enter the age of your dog : ");
				ageOfDog = input.nextInt();


				// If-else condtional block : 
				// if-else is a  contional statement used to the run the specific block of code 
				// when a specific condtion is met.
				//
				// An expression is a block of code or an instruction that may evaluate into 
				// either true / flase 


				if(ageOfDog == 4)
				{
						System.out.println("Your dog age is " + ageOfDog);
				}
				else
				{
						System.out.println("Your dog age is " + ageOfDog);
				}


				// Let's work with more practical example 
				System.out.println("Welcome to the Imagica Theme Park Mumbai!");

				System.out.println("[+]Enter your height for rollar coatser ride : ");
				height = input.nextFloat();

				System.out.println("[+]Enter your age : ");
				age = input.nextInt();

				if(age < 18)
				{
					criteria = false;
					fees = 0;
				}
				else if(age > 18 && height < 120 )
				{
					criteria = false;
					System.out.println("Drink some complain/ Horlicks");
					fees = 0;

				}
				else if(age > 18 && height > 120)
				{
						criteria = true;
						System.out.println("Great,here are yout rollar coaster tickets Sir!");
						fees = 399;
						
				}
				
				if(criteria == false)
				{
						System.out.println("you are not eligible for this ride");
				}
				else
				{
						System.out.println("Your fees will be " + fees);
				}


				// Closing the Scanner Class object
				input.close();

		}
}
