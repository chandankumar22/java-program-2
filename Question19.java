import java.util.*;
public class Question19 {
    //pattern question
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int a = 0;
        while(n!=0){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(j==n){
                    System.out.print("1 ");
                }else{
                    a = a+1;
                    System.out.print(a+" ");
                }
            }
            System.out.println();
        }
        System.out.print("Enter Number:");
        n = sc.nextInt();
        a = 0;
    }
    System.out.print("Program Terminates Here...!");
        sc.close();
    }
}
