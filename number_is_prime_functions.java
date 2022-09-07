import java.util.Scanner;
public class number_is_prime_functions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.:");
        int n = sc.nextInt();
        prime(n);
        
    }public static void prime(int n){
        if(n%2!=0){
            System.out.println(n+ " :The number is prime" );
        }else{
            System.out.println(n+ " :The number is not prime" );
        }
        
}
}
