import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter the  year ");
        Scanner sc=new Scanner(System.in);
        year= sc.nextInt();
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
        {
            System.out.println("the enter year is leap year "+year);
        }
        else
        {
            System.out.println("the entered year is not leap year");
        }

    }


}
