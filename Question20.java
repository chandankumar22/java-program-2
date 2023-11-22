import java.util.*;
public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int a = 0;
        
        while(n!=0){
        for(int i=n; i>=1; i--){
            int b = 0;
            for(int j=n; j>=i; j--){
                if(j==n){
                    a = a+1;
                    System.out.print(a+" ");
                }if(j==n-1){
                    b = j+a;
                    System.out.print(b+" ");
                }if(j<n-1){
                    b = b+j;
                    System.out.print(b+" ");
                }
            }
                System.out.println();
        }
        System.out.print("Enter Number:");
        n = sc.nextInt();
        a = 0;
    }
        sc.close();
    }
}
