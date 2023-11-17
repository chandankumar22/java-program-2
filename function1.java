import java.util.Scanner;
public class function1 {
    public static void printSum(int a,int b){
        int sum = a+b;
        System.out.println("Sum of a and b is:"+sum);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        printSum(a,b);
        sc.close();
    }
}
