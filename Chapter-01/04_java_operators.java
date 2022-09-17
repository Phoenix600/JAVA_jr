import java.util.Scanner;

public class Operator{
  public static void main(String[] args)
  {

    // ###################### ARITHMATIC OPERATORS #######################
    int sampleInt = 12;
    // Arithmatic operators
    ++sampleInt;
    System.out.println("The value of ++sampleInt : " + sampleInt);
  
    sampleInt++;
    System.out.println("The value of sampleInt++ : " + sampleInt);

    // sampleInt--;
    System.out.println("The value of sampleInt-- : " + sampleInt--);

    System.out.println("The value of --sampleInt : " +  --sampleInt);
    

    // There are three types of operator in JAVA 
    // postfix   oprand ++
    // prefix    ++oprand
    // infix     operand + operand 

    // ############################ RELATIONAL OPERATORS ######################
    String sampleMessage = "RACECAR";
    String cmpMessage = "RACECAR";
    String newMessage = "BOOLEAN";

    // Comparison 
    if (sampleMessage == newMessage)
    {
      System.out.println("Both strings newMessage and sampleMessage are equal");
    }
    System.out.println(sampleMessage == cmpMessage ? "Both strings are equal" : "String are not equl");
    System.out.println(sampleMessage == newMessage ? "Both strings are equal" : "String are not equl");
    System.out.println(sampleMessage != newMessage ? "Strings are different" : "String are same");
    System.out.println(sampleMessage == sampleMessage ? "This statement will always be printed" : "No matter what you try, this ");


    // ######################### ASSIGNMENT OPERATORS ##################################\
    int a = 12;
    int var;

    var = a;
    System.out.println("The value of var using = : " + var);

    var +=a;
    System.out.println("The value of var using += : " + var);

    var *=a;
    System.out.println("The value of var using *= : " + var);

    var /=a;
    System.out.println("The value of var using /= : " + var);

    var -=a;
    System.out.println("The value fo var using -= : " + var);


    // ############################# JAVA RELATIONAL OPERATORS #####################################
    // Relational operator checks the relationship between two operands

    int x = 12;
    int y = 3;

    System.out.println(x>y ? "x is greater than y " :  "y is greater than x");
    System.out.println(x<y ? "x is smaller than y" : "x is greater than y");
    System.out.println(x==y ? "X and y are same " : "x and y are not same");
    System.out.println(x!=y ? "x and y are different " : "x and y are same.");


//  #################### JAVA LOGICAL OPERATIONS ##################################
    
    
    float c = 13;
    float d = 14;
    
    if((c<d) || (c==d))
    {
      System.out.println("This statement prints when atleast one of the above expression is true.");
    }
    
    if((d>c) && (c<d))
    {
      System.out.println("This statement runs when both of the expression evaluates to true.");
    }



  }
}
