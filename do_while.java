public class do_while {
    public static void main(String[] args) {
        int a = 10;
        do{     //it runs at least once if we change the value of a from 0 to 10 then it will not see the condition written in the while it will print 10 instead of it is not smaller than 5.
            System.out.println(a);
            a++;
        }while(a<5);

        System.out.println("print first n nautural numbers using do-while loop:-");
        int b = 1;
        do{
            System.out.println(b);
            b++;
        }while(b<=100);
    }
   
    
}
