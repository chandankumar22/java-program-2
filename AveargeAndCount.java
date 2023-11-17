import java.util.*;
public class AveargeAndCount {
//chandan bhaiya question

//Find the average and count for every digit that is given by user untill and unkess user press 0 as input.
    
    public static void main(String[] args) {
        System.out.println("----Write 0 to stop----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        int count = 0;
        float avg = 0.0f;
        float sum = 0.0f;
        while(n!=0){
            count = count+1;
            System.out.println("count is:"+count);
           
            sum = sum+n;
            avg = (sum/count);
            System.out.println("Avg is:"+avg);
            
            System.out.print("Enter number:");
            n = sc.nextInt();
        }
            System.out.println("Count is:"+count);
            System.out.println("Avg is:"+avg);
            sc.close();

    }
   
    
}
