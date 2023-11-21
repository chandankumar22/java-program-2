import java.util.*;
public class Question11 {
    //pattern question
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row:");
        int r = sc.nextInt();
        System.out.print("Enter Column:");
        int c = sc.nextInt();
        while(r!=0){
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
        System.out.print("Enter Row:");
        r = sc.nextInt();
        System.out.print("Enter Column:");
        c = sc.nextInt();
    }
        sc.close();
    }
}
