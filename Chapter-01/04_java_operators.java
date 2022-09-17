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
    


  }
}
