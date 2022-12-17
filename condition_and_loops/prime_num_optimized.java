package condition_and_loops;
import java.util.Scanner;
public class prime_num_optimized {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number:");
    int num=sc.nextInt();
    int flag=0;
    if(num<=1){
     System.out.println("It is niehter Prime nor composite:");
    }
     for(int i=2;i*i<num;i++){  
        if(num%i==0){
        System.out.println("number is not prime");
        flag=1;
        break;
        }
     } if(flag==0){
        System.out.println("number is prime");
     }sc.close();
    }
}
