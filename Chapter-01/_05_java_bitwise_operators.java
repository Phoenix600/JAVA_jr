public class _05_java_bitwise_operators {
    public static void main(String[] args)
    {
        // Bitwise operators in Java 
        int a = 12;
        int b = 25;

        System.out.println("The answer of 12 | 25 : " + (a | b));
        System.out.println("The answer of 12 & 25 : " + (a&b));
        System.out.println("The answer of 12^25 : " + (a^b));
        System.out.println("The answer of ~12 : " + (~a));
    }
}
