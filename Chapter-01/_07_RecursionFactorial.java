import java.util.Scanner;

/**
 * Public Class to calculate the factorial of passed number 
 */
public class _07_RecursionFactorial {

    /**
     * @getFactorial() function calculates the factorial of given number
     * @param int n
     * @return int Fact :  Returns the factorial of passed number  
     */
    static int getFactorial(int n)
    {
        if(n == 1)
            return 1;
        return n *getFactorial(n-1);
    }
    public static void main(String... args)
    {
        // Declare the variables here 
        int num;
        // Declare Sacnner the class object to get input from the console 
        Scanner input = new Scanner(System.in);
        
        System.out.print("[+]Enter the number to calculate the factorial  : ");        
        num = input.nextInt();


        // Passing the variable num by : Call by value : 
        num = getFactorial(num);
        
        System.out.println("factorial : " + num);
        
        // After the use the input object mist be closed 
        input.close();
    }
}
