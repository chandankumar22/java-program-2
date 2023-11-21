import java.util.*;
public class Question16 {
    //pattern question
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        while(n!=0){
        for(int i=1; i<=n; i++){
            char c='A';
            for(int j=1; j<=i; j++){
                System.out.print(c+" ");
                c = (char) (c+1);
            }
            System.out.println();
        }
        System.out.print("Enter Number:");
        n = sc.nextInt();
    }
        sc.close();
    }
}
