public class break_statement {
    public static void main(String[]args){
        for(int i=1; i<=10; i++){
            System.out.println(i);
            System.out.println("Java is great");
            if(i==4){
                System.out.println("Ending the loop");
                break;
            }
        }
        System.out.println("OUTPUT BY WHILE LOOP");
        int b=0;
        while(b<=10){
            System.out.println(b);
            System.out.println("Java is great");
            if(b==3){
                System.out.println("Ending the loop");
                break;
            }
            b++;
        }
        System.out.println("OUTPUT BY DO-WHILE LOOP");
        int c=0;
        do{
           System.out.println(c);
            System.out.println("Java is great");
            if(c==3){
                System.out.println("Ending the loop");
                break;
            }
            c++; 
        }while(c<=5);
    }
    
}
