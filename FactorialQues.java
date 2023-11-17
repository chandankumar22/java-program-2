import java.util.*;
public class FactorialQues {
    //chandan bhaiya question
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        while(n!=0){
            int factorial = 1;
            for(int i=1; i<=n; i++){
                factorial = factorial*i;
                System.out.print(factorial+" ");
            }
            System.out.print("\nEnter Number:");
            n = sc.nextInt();
        }
        sc.close();
    }
}
