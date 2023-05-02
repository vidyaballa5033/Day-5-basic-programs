import java.util.Scanner;

public class harmonic {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the harmonic number n:");
        n = sc.nextInt();
        double harmonicValue = 0;
        for (int i = 1; i <= n; i++) {
            harmonicValue += 1.0/i;
        }
        System.out.println("The " + n + "th harmonic number is: " + harmonicValue);

    }
}