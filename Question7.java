import java.util.*;
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int a = 0;
        a = a+1;
        System.out.print(a+" ");
        for(int i=1; i<n; i++){
           for(int c=0; c<n; c++){
            if(i==(2*c)+1){
                a = a+2;
                System.out.print(a+" ");
            }else if(i==2*c && i/4!=1){
                a = a-1;
                System.out.print(a+" ");
            }else if(i==4*c){
                a = a+1;
                System.out.print(a+" ");
            }
           }
        }
       sc.close();
    }
}
