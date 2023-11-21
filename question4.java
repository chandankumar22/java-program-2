import java.util.*;
public class Question4 {
    public static void main(String[]args){
         System.out.println("      KILOMETERS TO MILES CONVERTOR      ");
         System.out.println("      -----------------------------      ");
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter the value in Kilometers:");
             double a = sc.nextFloat();
             //1 km = 0.621371 miles
             double miles = a*0.621371;
             System.out.println("The value of km in miles is " + miles + " miles");
            sc.close();// Close the Scanner object to avoid resource leak.
       
        }
        
    }

