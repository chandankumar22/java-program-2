import java.util.*;
public class Question20 {
    //pattern question
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int a = 0;
        
        while(n!=0){
            for(int i=1; i<=n; i++){
                int diff = 0, gap = n-1, number = i;
                for(int j=1; j<=i; j++){
                    System.out.print(number+ " ");
                    diff+=gap;
                    number+=diff;
                    gap=-1;
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
