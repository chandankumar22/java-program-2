import java.util.*;
public class Question10 {
    //Write a Java program that takes three numbers from the user and prints the greatest number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1:");
        int a = sc.nextInt();
        System.out.print("\nEnter Number 2:");
        int b = sc.nextInt();
        System.out.print("\nEnter Number 3:");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+" (a)is greater among them");
        }else if(b>a && b>c){
            System.out.println(b+" (b)is greater among them");
        }else if(c>a && c>b){
            System.out.println(c+" (c)is greater among them");
        }
        sc.close();

        //Write a Java program to print a face.

            System.out.println(" +\"\"\"\"\"+ ");
            System.out.println("[| o o |]");
            System.out.println(" |  ^  | ");
            System.out.println(" | '-' | ");
            System.out.println(" +-----+ ");

    }
}
    