import java.util.Scanner;

public class primeFactor {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        n= sc.nextInt();
        // Traverse till i*i <= n for efficiency
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n=n/i;
            }
            if(n>1){
                System.out.println(n);
            }
            }
    }
}
