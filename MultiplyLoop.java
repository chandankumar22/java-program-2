import java.util.*;
public class MultiplyLoop {
    public static void main(String[]args){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(i=1; i<=m;i++){
            System.out.println(n+"*"+i+"="+n*i);
    }
   
}
}
