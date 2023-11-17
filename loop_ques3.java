import java.util.Scanner;
public class loop_ques3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        for(int i = 0; i <= a; i++){
            for(int j = 0; j <= b; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
