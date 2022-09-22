public class JavaMethods
{

   static int N = (int)(1e7+10);

    static int[] BigArray = new int[N];
static  int average(int firstNumber, int secondNumber)
        {
            return ((firstNumber + secondNumber) /2);
        }


    public static void main(String... args)
    {
        int SIZE = (int)(1e7+10);
        int[]  hashArray = new int[SIZE];
        System.out.println(average(5, 1));
        System.out.println(BigArray[0]);
        hashArray[(int)(1e7)] = 1212;
        System.out.println(hashArray[(int)(1e7)]);
        System.out.println(BigArray.length);
    }
}