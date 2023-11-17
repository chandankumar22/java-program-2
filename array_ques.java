//Q1. Write a program to sum up the even and odd position element of the array. Display the difference between the two also.
public class array_ques {
      public static void main(String[]args){
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int evenSum=0;
        int oddSum=0;

        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                evenSum = evenSum+arr[i];
            } else{
                oddSum = oddSum+arr[i];
            }
        }
        int diff = evenSum - oddSum;
        System.out.println("EvenSum of this array is:"+evenSum);
        System.out.println("OddSum of this array is:"+oddSum);
        System.out.println("Difference of evensum and oddsum is:"+diff);
       
      }    
}
