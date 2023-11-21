import java.util.*;
public class Question17 {
    //pattern question
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int d = 1;
        int a = 0;
        int b = 1;
        System.out.println(d);
        while(n!=0){
        for(int i=2; i<=n; i++){
            for(int j=1; j<=i; j++){
                int c = a+b;
                System.out.print(c+" ");
                a = b;
                b = c;
            }
            System.out.println();
        }
        System.out.print("Enter n:");
        n = sc.nextInt();
        d = 1;
        a = 0;
        b = 1;
        System.out.println(d);
    }
    sc.close();
    }
    
}
