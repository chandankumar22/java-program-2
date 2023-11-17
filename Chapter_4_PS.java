import java.util.Scanner;
public class Chapter_4_PS {
    //QUESTION 2
    public static void main(String[] args){
        System.out.println("   Pass Or Fail Analyzer   ");
        System.out.println("   ---------------------   ");

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Marks Of Science:");
    float a = sc.nextFloat();
    System.out.print("Enter Marks Of Maths:");
    float b = sc.nextFloat();
    System.out.print("Enter Marks OF S.S.T:");
    float c = sc.nextFloat();
    
    float P = (a+b+c)/(300)*(100);
      if(a>=33 && b>=33 && c>=33 && P>=40){
        System.out.print("PASS,AND OVERALL PERCENTAGE IS:"+P+"%");
      }
      else{
        System.out.print("FAIL,AND OVERALL PERCENTAGE IS:"+P+"%");
      }
    sc.close();
      
    } 
}
