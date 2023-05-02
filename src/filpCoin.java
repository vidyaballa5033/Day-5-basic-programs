import java.util.Scanner;

public class filpCoin {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0;
        int num;
        double coin=0;
        System.out.println("enter number of times to flip coin ");
        Scanner sc=new Scanner(System.in);
        num =sc.nextInt();
        for(int i=0;i<num;i++){
            coin=Math.random();
        }
        if (coin<=0.5){
            head++;
        }
        else {
            tail++;
        }
        int headpercentage =head*100/num;
        int tailpercentage=tail*100/num;

        System.out.println("head-percentage"+headpercentage);
        System.out.println("tail-percentage"+tailpercentage);

    }
}
