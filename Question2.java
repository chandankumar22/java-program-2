import java.util.*;
public class Question2 {
    //chandan bhaiya question
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int count = 0;
        for(int i=1; i<=n; i++){
            if((n%2==0 && n%5==0 && n%3==0) || (n%2==0 && n%3==0 && n%5!=0) || (n%3==0 && n%5==0 && n%2!=0) || (n%2==0 && n%5==0 && n%3!=0) || (n%2==0 && n%3!=0 && n%5!=0) || (n%3==0 && n%2!=0 && n%5!=0) || (n%5==0 && n%2!=0 && n%3!=0) || (n%2!=0 && n%5!=0 && n%3!=0)){
                if(n%2!=0 && n%5!=0 && n%3!=0){
                count = count+1;
                n = n-1;
                System.out.println(n+" a");
                }else{
                        for(int j=0; j<=n; j++){
                                if(n%5==0 && n%2!=0 && n%3!=0){
                                    n = n/5;
                                    System.out.println(n+" b");
                                    count = count+1;
                                }else if(n%2==0 && n%3!=0 && n%5!=0){
                                    n = n/2;
                                    System.out.println(n+" c");
                                    count = count+1;
                                }else if(n%3==0 && n%2!=0 && n%5!=0){
                                    n = n/3;
                                    System.out.println(n+" d");
                                    count = count+1;
                                }else if(n%3==0 && n%2==0 && n%5==0){
                                    n = n/5;
                                    System.out.println(n+" e");
                                    count = count+1;
                                }else if(n%2==0 && n%3==0 && n%5!=0){
                                    n = n/3;
                                    System.out.println(n+" f");
                                    count = count+1;
                                }else if(n%2==0 && n%5==0 && n%3!=0){
                                    n = n/5;
                                    System.out.println(n+" g");
                                    count = count+1;
                                }else if(n%3==0 && n%5==0 && n%2!=0){
                                    n = n/5;
                                    System.out.println(n+" h");
                                    count = count+1;
                                }

                                if(n%2!=0 && n%3!=0 && n%5!=0) break;
            
                        }
                       
                    }  
                        

                if(n==1){
                    count = count+1;
                    n = n-1;
                    System.out.println(n+" i");
                    System.out.println("Minimum steps involve in this is "+count);
                }
               
                   
            }
                if(n==0) break;
        }
                       
        sc.close();
    }
}