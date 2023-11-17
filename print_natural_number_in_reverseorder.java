import java.util.Scanner;
public class print_natural_number_in_reverseorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.:-");
        int n = sc.nextInt();
        System.out.println("Print natural number in reverse order:-");
            for(int i=n; i>=1; i--){
                System.out.println(i);
            }
            sc.close();
    }
}
