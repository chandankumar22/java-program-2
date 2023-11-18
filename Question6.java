import java.util.*;
public class Question6 {
    /*given n, print sum of numbers from 1 to n by changing sign of alternate numbers
    n=10
    1-2+3-4+5-6+7-8+9-10 = -5
    chandan bhaiya question*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int a = 0;
        a = a+1;
        System.out.print(a);

        for(int i=2; i<=n; i++){
            if(i%2==0){
            a = a-i;
            System.out.print("-"+i);
            }else if(i%2!=0){
                a = a+i;
                System.out.print("+"+i);
            }
        }
        System.out.print(" = "+a);
        sc.close();
    }
}
