public class arithmeticoperation {
    public static void main(String[] args){
        
        int x=15;
        int y=10;
        
    
    //->addition
        int sum=x+y;
        System.out.println("Sum of " + x + " and " + y + " is " + sum);
        
    //->multiplication
        int product=x*y;
        System.out.println("Product of " + x + " and " + y + " is " + product);
    
    //->Division (Whenever we divide in java it gives quotient in output. Example quotient of 15/10 is 1)
        int division=x/y;
        System.out.println("Division of " + x + " and " + y + " is " + division);    
    
    //->Division (Whenever we divide in java it gives quotient in output. Example quotient of 10/15 is 0)
        int divide=y/x;
        System.out.println("Division of " + x + " and " + y + " is " + divide);    
    
    //->Modulus or remainder(%)
        int remainder=x%y;
        System.out.println("Remainder of " + x + " and " + y + " is " + remainder);    
    
    /*->Expression (priority of Multiplication(*),Division(/) and modulus(%) are same in any expression program
                   in java but this priority is greater than the Addition(+) and Subtraction(-) they both addition
                   and subtraction are same in priority level but lower than or operate after those three arithmetic
                   operator in java program. In java no bodmas rule will work it was the rule that i mentioned below.)
                   Priority of(*,/,%) is greater than(>) the priority of(+,-)
                   If divide,multiply,modulus come together in one expression then the program will execute on the
                   basis of their usage in exp the operator which uses in left most side of the program then the 
                   program will take that left part operator and operate that in exp after that it will come to right
                   side operator.----------> EXAMPLE x*y/x+y--->Here as we know that multiply and divide has same 
                   priority in exp in java so firstly it will start with multiplication and then division because 
                   multiplication operator is on the left most side of the exp that's why it will apply first in exp.
                   We fix the priority by applying brackets in our exp.-----> Example (x*y)/(x+y)----> Firstly it
                   will do multiplication and then it will do addition then division will occur.
                   Here we fix the priority by applying brackets in our expression. */
        int exp1=x*y/x+y;
        System.out.println("Answer of the expression 1 is:" + exp1);  
         
    // priority fix in exp by appling brackets in exp.
       int exp2=(x*y)/(x+y);
       System.out.println("Answer of the expression 2 is:" + exp2);
    }
}
