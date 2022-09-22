public class JavaArrays 
{
		public static void main(String[] args)
		{

			// Declaring the array statically 
			String Names[] = {"Rahul","Ramesh","Reshma","Rashika","Rutuja","Rohini"};

			// Declaring the arrays in the JAVA dynamically 
			int marks[] = new int[15];

			// Declaring the two dimensional arrays 
			int matrix[][] = new int[3][3];


			// Assigning the values to the arrays 

			marks[0] = 46;
			marks[1] = 33;

			System.out.println("The elements inside the String Names[] arrays is : ");

			int SIZE = Names.length;

			for(int i=0; i < Names.length; i++)
			{
					System.out.printf("Arr[%d]	:	%s\n",i,Names[i]);
			}
			System.out.println("Maths Marks : " + marks[0]);
		}
}

