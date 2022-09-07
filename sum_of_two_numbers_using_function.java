import java.util.Scanner;

public class sum_of_two_numbers_using_function {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.:");
        int n1 = sc.nextInt();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter second no.:");
        int n2 = scan.nextInt();
        add(n1,n2);

    }public static void add(int n1 , int n2){
        System.out.println("The sum is:" +(n1+n2));
}
}
