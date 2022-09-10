import java.util.Scanner;
public class primenumbers_range {  
   public static void main(String[] args) {  
       Scanner s = new Scanner(System.in);  
       System.out.print("Enter the first number : ");  
       int start = s.nextInt();  
       System.out.print("Enter the second number : ");
       int end = s.nextInt(); 
       s.close(); 
       isPrime(start,end);
   }  
   public static void isPrime(int start, int end) {  
    for(int i =start;i<=end;i++){
        for(int j = 2;j<=i;j++){
            if(i%j!=0){
                break;
            }if(i==j){
                System.out.println("List of prime numbers between " + start + " and " + end + " are: " +j);  
            
            }
        }
    }
    
    
   }  
}  