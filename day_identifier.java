import java.util.Scanner;
public class day_identifier {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of day you want to display:");
        int a = sc.nextInt();
    switch(a){
        case 1:
            System.out.println("The Day Is Monday");
            break;
        case 2:
            System.out.println("The Day Is Tuesday");
            break;
        case 3:
            System.out.println("The Day Is Wednesday");
            break;
        case 4:
            System.out.println("The Day Is Thursday");
            break;
        case 5:
            System.out.println("The Day Is Friday");
            break;
        case 6:
            System.out.println("The Day Is Saturday");
            break;
        case 7:
            System.out.println("The Day Is Sunday");
        default:
            System.out.println("Only 7 days in a week");
    }
    sc.close();
    }
    
}
