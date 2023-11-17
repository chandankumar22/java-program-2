import java.util.Scanner;
public class percentage {
    public static void main(String[]args){
    
    System.out.println("    WELCOME TO CBSE 10th BOARD RESULT PERCENTAGE CALCULATOR    ");
    System.out.println("    -------------------------------------------------------    ");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of Maths:");
        float a = sc.nextFloat();
        System.out.print("Enter marks of Science:");
        float b = sc.nextFloat();
        System.out.print("Enter marks of S.S.T:");
        float c = sc.nextFloat();
        System.out.print("Enter marks of Sanskrit:");
        float d = sc.nextFloat();
        System.out.print("Enter marks of English:");
        float e= sc.nextFloat();

        float P = ((a+b+c+d+e)/500.0f)*(100);

        System.out.println("Percentage of Student in CBSE Board Exam Is : " + P + "%");

        if(P >= 90){
            System.out.println("Congratulations You Are Promoted To Higher Class...!");
        }
        else if(P >= 80 && P < 90){
            System.out.println("Congratulations You Are Promoted To Higher Class,But You Have To Work Hard...!");
        }
        else if(P >= 70 && P < 80){
            System.out.println("Work Hard....!");
        }
         else if(P >= 60 && P < 70){
            System.out.println("Meets Expectation...!");
        }
         else {
            System.out.println("Fail...!!!!");
        }
        sc.close();// Close the Scanner object to avoid resource leak.
    
    }
}
