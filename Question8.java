import java.util.*;
public class Question8 {
    //Write a Java program to get a number from the user and print whether it is positive or negative
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        while(n!=0){
        if(n>0){
            System.out.println("Number is positive");
        } else if(n<0){
            System.out.println("Number is negative");
        }
        System.out.print("Enter Number:");
        n = sc.nextInt();
    }
        sc.close();
    }
}
