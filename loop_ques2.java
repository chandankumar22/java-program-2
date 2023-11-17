import java.util.Scanner;
public class loop_ques2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.print("Enter mark:");
            int marks = sc.nextInt();
        
            if(marks >= 90 && marks <= 100){
                System.out.println("This is Good");
            } else if(marks >= 60 && marks <= 89){
                System.out.println("This is also Good");
            } else if(marks >= 0 && marks <= 59){
                System.out.println("This is Good as well");
            }else{
               System.out.println("INVALID");
            }
             System.out.println("If you want to continue\n1.YES\n2.NO");
             n = sc.nextInt();
        }while(n == 1);
        sc.close();
    }
}
