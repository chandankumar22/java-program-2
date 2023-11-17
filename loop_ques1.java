import java.util.*;
public class loop_ques1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //If we want to use both string and int type data together in a code then it will give an error so there is a solution of this problem is that we will convert integer into string with {Integer.parseInt(sc.nextLine())}.
       int n = Integer.parseInt(sc.nextLine());
       String name = sc.nextLine();
       System.out.println("Hello "+name+". Here is the counting.");
       for(int i=1; i<=n; i++){
            System.out.println(i);
       }
       sc.close();
     
    }
    
}
