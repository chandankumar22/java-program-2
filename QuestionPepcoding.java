import java.util.*;
public class QuestionPepcoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter t:");
        int t = sc.nextInt();
        while(t!=0){
        for(int i=t; i>=1; i--){
            int n = sc.nextInt();
            for(int j=2; j<=Math.sqrt(n); j++){
              if(n%j==0){
                System.out.println(n+" is prime");
              }else {
                System.out.println(n+" is not prime");
              }
            }
       }
        System.out.print("Enter t:");
         t = sc.nextInt();
    }

       sc.close();
    }
}
