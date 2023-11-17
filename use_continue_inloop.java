public class use_continue_inloop {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            if(i==2){
                System.out.println("ENDING THE LOOP");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }
        System.out.println("OUTPUT FOR DO-WHILE LOOP");
        int b=0;
        do{
            b++;
            if(b==3){
                System.out.println("ENDING THE LOOP");
                continue;
            }
            System.out.println(b);
            System.out.println("JAVA IS GREAT");
        }while(b<6);

        System.out.println("OUTPUT FOR WHILE LOOP");
        int c=0;
        while(c<=10){
            c++;
            if(c==3){
                System.out.println("ENDING THE LOOP");
                continue;
            }
            System.out.println(c);
            System.out.println("JAVA IS GREAT");
            
        }
    }
}
