import java.util.*;
public class EvenNumber {
//chandan bhaiya question
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
    while(n!=0){ //use while here to take inputs,end taking input when we put value of n==0
        /*Print alternate even numbers (2,6,10,14,18.......)
        for(int i=1; i<=n; i=i++){
            if(i%2==0 && i%4!=0){
                System.out.print(i+" ");
            }
        }*/    

           /* Print even numbers without using modulus where n=user input
        for(int i=1; i<=n; i=i++){
            for(int count=0;count<=n;count++){
                float m = i/2.0f;
                    if(m==count){
                        System.out.println(i+" is even");
                    }
            }
        }*/
        //print even number without using if();
        for(int i=2; i<=n; i=i+2){
            System.out.print(i+" ");
        }
        System.out.print("\nEnter n:");
        n = sc.nextInt();
    }
        System.out.println("\nThnk");
        sc.close();
    }
}
