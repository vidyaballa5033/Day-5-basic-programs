import java.util.Scanner;

public class swapTwoNumbers {
    public static void main(String[] args) {


        int n1;
        int n2;
        int x;
        Scanner s = new Scanner(System.in);
        System.out.println("enter n1 number");
        n1 = s.nextInt();
        System.out.println("enter n2 number");
        n2 = s.nextInt();
        System.out.println("before swapping");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println("after swapping ");
        x = n1;
        n1 = n2;
        n2 = x;
        System.out.println(n1);
        System.out.println(n2);


    }
}
