import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();  //
    
        if(n%2==0){
            System.out.println(n+" is divisible by 2");
        }if(n%3==0){
            System.out.println(n+" is divisible by 3");
        }if(n%5==0){
            System.out.println(n+" is divisible by 5");
        }if(n%2!=0 && n%3!=0 && n%5!=0){
            System.out.println(n+" is not divisible by 2,3 and 5");
        }

        // while(n!=0){
        //         if(n%2==0 && n%3!=0 && n%5!=0){
        //             System.out.println(n+" is divisible by 2");
        //         }else if(n%3==0 && n%2!=0 && n%5!=0){
        //             System.out.println(n+" is divisible by 3");
        //         }else if(n%5==0 && n%2!=0 && n%3!=0){
        //             System.out.println(n+" is divisible by 5");
        //         }else if(n%3==0 && n%2==0 && n%5!=0){
        //             System.out.println(n+" is divisible by 2 and 3");
        //         }else if(n%3==0 && n%2!=0 && n%5==0){
        //             System.out.println(n+" is divisible by 3 and 5");
        //         }else if(n%3!=0 && n%2==0 && n%5==0){
        //             System.out.println(n+" is divisible by 2 and 5");
        //         }else if(n%3==0 && n%2==0 && n%5==0){
        //             System.out.println(n+" is divisible by 2,3 and 5");
        //         }else if(n%3!=0 && n%2!=0 && n%5!=0){
        //             System.out.println(n+" is not divisible by 2,3 and 5");
        //         }
        //             System.out.print("Enter Number:");
        //             n = sc.nextInt();
        //     }

        sc.close();

    }
}
