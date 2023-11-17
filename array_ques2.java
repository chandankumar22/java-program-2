import java.util.Scanner;
//Write a program to convert a hexadecimal no. to decimal . The hexadecimal  no. is accepted as an array of characters. 
public class array_ques2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of an array:");
    int size = sc.nextInt();
    int [] arr=new int[size];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
     sc.close();
    }
}
