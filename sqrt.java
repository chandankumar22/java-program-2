import java.util.Scanner;
public class sqrt {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x:");
        double x = sc.nextDouble();
        x = Math.sqrt(x);
        System.out.println(x);
        // int a = sc.nextInt();
        // int[] a = {1,2,3,4,5};
        // System.out.println("original");
        // for(int i=0; i < a.length; i++){
        //     System.out.println(a[i]);
        // }
        // for(int i = a.length - 1; i >= 0; i--){
        //     System.out.println(a[i]);
        // }

      sc.close();
    }
   
}
