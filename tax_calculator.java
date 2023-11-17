import java.util.*;
public class tax_calculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter income in lakhs per annum:");
        double income = sc.nextDouble();
        double tax = 0;
        if(income<=250000){
            tax = tax+0;
            System.out.println("No tax is applicable below 2.5 lakhs"+tax);
        }else if(income>250000 && income<500000){
            tax = (income-250000)*0.05;
            System.out.print("Tax of income lies in between 2.5 lakh and 5 lakh is:"+tax);
        }else if(income>=500000 && income<1000000){
            tax = (500000-250000)*0.05;
            tax = tax+(income-500000)*0.2;
            System.out.print("Tax of income lies in between 5 lakh and 10 lakh is:"+tax);
        }else if(income>=1000000){
            tax = (500000-250000)*0.05;
            tax = tax+(1000000-500000)*0.2;
            tax = tax+(income-1000000)*0.3;
            System.out.print("Tax of income above 10 lakh:"+tax);
        }
        sc.close();
    }
}
