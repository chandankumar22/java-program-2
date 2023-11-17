import java.util.*;
//import java.lang.Math;
public class GuessTheNumber {
//chandan bhaiya question
    public static void main(String[] args) {
        int n = (int) (Math.random() * 100) + 1; 
        Scanner sc = new Scanner(System.in);
        //Make this game like user can get only 5 attempts to guess the number.
        for(int i=1; i<=5; i++){
        System.out.print("Guess The Number:");
        int m = sc.nextInt();
       // while(m!=-1){
            if(m>n){
                System.out.println("Your guessed number "+m+" is greater than the number");
            }else if(m<n){
                System.out.println("Your guessed number "+m+" is smaller than the number");
            }
            // System.out.print("Guess The Number:");
            // m = sc.nextInt();
            //if(m==n) break;
            else if(m==n){
                System.out.println("Congratulation you guess the number "+m);
                break;
            }
        //}
            if(i==5){
                System.out.println("You don't have extra attempt. Number is " + n);
            }
    }
     sc.close();
    }
}