import java.util.*;
public class Ques {
//chandan bhaiya question

//question 1-> input n(any number) let's suppose 4 then expected output is (1,3,6,10)
//question 2-> input n(any number) let's suppose 4 then expected output is (10,6,3,1)
    
    public static void main(String[] args) {
        //question 1
    //while(n!=0){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number:");
        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i=1; i<=n; i++){
        //     sum = sum+i;
        //     System.out.print(sum+" ");
        // }
        //System.out.println("Enter number:");
        //n = sc.nextInt();
    //}

        //question 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        int sum = 0;
    while(n!=0){
        for(int i=1; i<=n; i++){
            sum = sum+i;
        }
        System.out.print(sum+" ");
        for(int j=n; j>=2; j--){
            sum = sum-j;
            System.out.print(sum+" ");
        }
        System.out.print("\nEnter number:");
        n = sc.nextInt();
    }
    System.out.println("Thanks for using my program...!");
        sc.close();
    }
}
