import java.util.Scanner;
public class factorial {
    public static void main(String[]args){
        int factorial=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of n:");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
        
            if(i==n){
                System.out.print(i);
            }else{
                System.out.print("*"+i);
            }
             factorial=factorial*i;
            
    }
       System.out.print("="+factorial); 
       sc.close();

    }
}
