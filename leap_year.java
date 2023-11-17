import java.util.Scanner;
public class leap_year {
    public static void main(String[]args){
        System.out.println("------WELCOME TO LEAP YEAR IDENTIFIER------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year:");
        int year = sc.nextInt();
        if(year % 4 == 0 && year%400 == 0){
            System.out.println(year+ " is leap year");
        } else{
            System.out.println(year+" is not leap year");
        }
        sc.close();
    }
    
}
