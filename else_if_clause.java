import java.util.Scanner;
public class else_if_clause {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x:");
        int x = sc.nextInt();
    if(x % 2 == 0){
        System.out.println(x + " is even");
    }
    else{
        System.out.println(x + " is odd");
    }


    System.out.print("Enter n1:");
        int n1 = sc.nextInt();
    System.out.print("Enter n2:");
        int n2 = sc.nextInt();   
    if(n1 == n2){
        System.out.println(n1 + " is equal to " + n2);
    }
    else if(n1 > n2){
        System.out.println(n1 + " is greater than " + n2);
    }
    else{
        System.out.println(n1 + " is less than " + n2);
    }
   System.out.println("Program executed successfully");
    
        sc.close();   
    }  
      
}