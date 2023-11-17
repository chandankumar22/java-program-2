import java.util.*;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int a = 0;
         a = a+1;
         System.out.print(a+" ");
        for(int i=1; i<n; i++){
             if(i%2==0 && i%4!=0){
                a = a-1;
                System.out.print(a+" ");
            }else if(i%4==0){
                a = a+1;
                System.out.print(a+" ");
            }else if(i%2!=0){
                a = a+2;
                System.out.print(a+" ");
            }
        }
        sc.close();
    }
    
    
}
