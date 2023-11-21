import java.util.*;
public class Question18 {
    //pattern question
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        while(n!=0){
        for(int i=1; i<=n; i++){
            int a = 0;
            int b = 1;
            for(int j=1; j<=i; j++){
                if(j==1){
                    System.out.print(a+" ");
                }else if(j==2){
                    System.out.print(b+" ");
                }else if(j>2){
                    int c = a+b;
                    System.out.print(c+" ");
                    a = b;
                    b = c;
                }
            }
            System.out.println();
        }
            System.out.print("Enter Number:");
            n = sc.nextInt();
        }
        sc.close();
    }
}
