import java.util.*;
public class Question {
    //Chandan bhaiya Ques
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int c;
        int d;
        while(n!=0){
        int i = n;
            d = 1*n;
            System.out.print(d+" ");
            for(int j=1;j<(n/2); j++){
                i = i-1;
                c = (i)*(j+1);
                System.out.print(c+" ");
            }
            if(n%2!=0){
                n = (n/2)+1;
                System.out.print(n);
            }
             System.out.print("\nEnter Number:");
             n = sc.nextInt();   
        }
            sc.close();
    }
}
