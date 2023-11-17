import java.util.Scanner;
public class url_identifier {
    public static void main(String[]args){
        System.out.println("[------Welcome to URL identifier------]");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the url for which you want to get information:");
        String url = sc.next();

        switch(url){
            case ".com":
                System.out.println(url+" is commercial website");
                break;
            case ".org":
                System.out.println(url+" is organisation website");
                break;
            case ".in":
                System.out.println(url+" is an indian website");
                break;
            default:
                System.out.println("URL is not matched");
        }
        System.out.println("Thanks for using URL identifier");
        sc.close();
    }
}
