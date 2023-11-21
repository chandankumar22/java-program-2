import java.util.*;
public class Question9 {
    //Write a Java program to solve quadratic equations
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        double a = sc.nextDouble();
        System.out.print("Enter b:");
        double b = sc.nextDouble();
        System.out.print("Enter c:");
        double c = sc.nextDouble();
        double D = (b*b)-(4*a*c);
        double y = (b*b)-(4*a*c);
        if(D>0){
            double x = (-b + Math.sqrt(y))/2*a;
            double z = (-b - Math.sqrt(y))/2*a;

            System.out.println(x+" and "+z);
        }else{
            System.out.println("D can't be negative");
        }
        sc.close();
    }
}
