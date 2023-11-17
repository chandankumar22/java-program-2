import java.util.*;
public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int count = 0;
        for(int i=1; i>=1; i++){
            if(n%2!=0 && n%5!=0 && n%3!=0){
                count = count+1;
                n = n-1;
                    if(n%2==0 && n%5!=0 && n%3!=0){
                        count = count+1;
                        n = n/2;
                    }else{
                          for(int j=0; j>=1; j++){
                                if(n%5==0 && n%2!=0 && n%3!=0){
                                    n = n/5;
                                    count = count+1;
                                }else if(n%2==0 && n%3!=0 && n%5!=0){
                                    n = n/2;
                                    count = count+1;
                                }else if(n%3==0 && n%2!=0 && n%5!=0){
                                    n = n/2;
                                    count = count+1;
                                }else if(n%3==0 && n%2==0 && n%5==0){
                                    n = n/5;
                                    count = count+1;
                                }

                                if(n%2!=0 && n%3!=0 && n%5!=0) break;
            
                            }
                        }

                if(n==1){
                    count = count+1;
                    n = n-1;
                    System.out.print("Minimum steps involve in this is"+count);
                }
               
                    
            }
             if(n==0) break;       
        }

        sc.close();
    }
}
