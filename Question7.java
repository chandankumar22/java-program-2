import java.util.*;
public class Question7 {
    //chandan bhaiya question
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int a = 0;
        a = a+1;
        System.out.println(a+" ");
        for(int i=1; i<=n-1; i++){
            System.out.print(i);
            System.out.println();
           for(int c=0; c<=i; c++){
             //System.out.println(c+",");
            if(i==(2*c)+1){
                a = a+2;
                System.out.println(a+"i ");
            }else if(i==2*c && (i%4)!=0){
                a = a-1;
                System.out.println(a+"j ");
            }else if(i==4*c){
                a = a+1;
                System.out.println(a+"k ");
            }
           }
        }
       sc.close();
    }
}
