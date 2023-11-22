import java.util.*;
public class Question22 {
    //pattern question
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int a = 0;
        while(n!=0){
        for(int i=1; i<=n; i++){
            int b = 0;
            for(int j=1; j<=i; j++){
                if(j==1){
                    a = a+i;
                    System.out.print(a+" ");
                }if(j==2){
                    b = a-1;
                    System.out.print(b+" ");
                }if(j>2){
                    b = b-1;
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
