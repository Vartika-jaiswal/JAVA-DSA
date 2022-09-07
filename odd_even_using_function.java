import java.util.Scanner;

public class odd_even_using_function {
    public static void main (String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number for check odd or even: ");
        int num=scan.nextInt();
        
        find_Oddeven(num);
        }
        
        static void find_Oddeven(int num){
        if(num%2==0) 
            System.out.println(num+" is even"); 
        else 
            System.out.println(num+" is odd");
        }
}
