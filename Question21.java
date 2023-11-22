import java.util.*;
public class Question21 {
    //pattern question
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        while(n!=0){        
            for(int i=1; i<=n; i++){
                for(int j=0; j<i; j++){
                     if(i%2!=0){
                        int b = (2*j)+1;
                        System.out.print(b+" ");
                    }else if(i%2==0){
                        int c = (2*j)+2;
                        System.out.print(c+" ");
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
