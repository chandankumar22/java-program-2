import java.util.Scanner;
public class switch_case_ques {
    public static void main(String[]args){
        System.out.println("----WELCOME TO GRADE IDENTIFIER----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        switch(n){
            case 0:
                System.out.println("STOP");
                break;
            case 1:
                System.out.print("Enter mark:");
                    int marks = sc.nextInt();
        
                    if(marks >= 90 && marks <= 100){
                    System.out.println("This is Good");
                    } else if(marks >= 60 && marks <= 89){
                    System.out.println("This is also Good");
                    } else if(marks >= 0 && marks <= 59){
                    System.out.println("This is Good as well");
                    }else{
                    System.out.println("INVALID INPUT");
                    }
                break;
            default:
                System.out.print("Can't take input other than 0 and 1");
                break;
        }
        System.out.println("Thanks for using GRADE IDENTIFIER");
        sc.close();
    }
}
