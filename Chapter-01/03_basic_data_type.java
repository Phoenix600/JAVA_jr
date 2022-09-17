// Import java libraries here 
import java.util.Scanner;
import java.lang.String;

public class DataTypes
{
  public static void main(String[] args)
  {
    // Declare variables here 
    double myDouble = 3.33333;
    float myFloat = 3.3F;

    double myDoubleScientific = 3.44e4;

    System.out.println("The value of myDouble variable is : " + myDouble);
    System.out.println("The value of myFloat variable is : " + myFloat);
    System.out.println("The value of scientif variable is : " + myDoubleScientific);

    
    // char literals 
    char letter = 'S';
    String name = "Sheldon Cooper";
    
    System.out.printf("%s for %s \n",letter,name);
    
    // Range of -32768 to 32767
    short temperature = -200;
    
    int idPass = 120001456;
    System.out.println("Your Id pass is : " + idPass);

    double pointer = 32.22;
    System.out.print("Pointer : " + pointer);

    float marks = 12.12f;
    System.out.println("Marks Obtained you : " + marks);


    


  }
}
