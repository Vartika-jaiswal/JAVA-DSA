import java.util.Scanner;

public class factorial_function{  
    public static void main(String args[]){  
        int fact=1; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");  
        int number=sc.nextInt();
        sc.close();//It is the number to calculate factorial    
            
        fact = factorial(number);   
        System.out.println("Factorial of "+number+" is: "+fact);    
        
       }  static int factorial(int n){    
        if (n == 0)    
          return 1;    
        else    
          return(n * factorial(n-1));    
       }    
   }  