import java.util.Scanner;

public class quotientRemainder {
    public static void main(String[] args) {
        int dividend;
        int divisor;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter dividend value:");
        dividend =s.nextInt();
        System.out.println("Enter divisor value :");
        divisor=s.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
