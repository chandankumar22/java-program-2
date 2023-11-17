import java.util.Scanner;
public class switch_case {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age:");
        int age = sc.nextInt();

    switch(age){ //Age is an integer variable so variable can be of any type char int string
        case 18:
            System.out.println("You are going to become an adult");
            break;
        case 23:
            System.out.println("You are going to get a job");
            break;
        case 28:
            System.out.println("You are going to marry");
            break;
        case 60:
            System.out.println("You are going to get retired from your job");
            break;
        default:
            System.out.println("Enjoy Your Life");
        }
        sc.close();
    }
    
}
