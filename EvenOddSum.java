import java.util.*;
public class EvenOddSum {
//chandan bhaiya question
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt(); //10
        while(n!=0){
            int evenSum = 0;
            int oddSum = 0;
            for(int i=1; i<=n; i++){
                if(i%2==0){
                    evenSum = evenSum+i;
                }else{
                    oddSum = oddSum+i;
                }
            }
            System.out.println("Even Sum = "+evenSum);
            System.out.println("Odd Sum = "+oddSum);
            System.out.print("Enter n:");
            n = sc.nextInt();
        }
        sc.close();
    }
}
