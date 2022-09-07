import java.util.Scanner;
public class product_of_numbers_functions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.:");
        int n1 = sc.nextInt();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter second no.:");
        int n2 = scan.nextInt();
        mul(n1,n2);

    }public static void mul(int n1 , int n2){
        System.out.println("The product of two numbers is:" +(n1*n2));
}
}
