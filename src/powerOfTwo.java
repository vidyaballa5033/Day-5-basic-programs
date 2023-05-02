import java.util.Scanner;
public class powerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number ");
        int num = scanner.nextInt();
        if (num < 32) {
            for (int i = 0; i <= num; i++) {
                int powerOf2 = (int) Math.pow(2, i);
                System.out.println("2^" + i + " = " + powerOf2);
            }
        } else {
            System.out.println("");
        }
    }

}



