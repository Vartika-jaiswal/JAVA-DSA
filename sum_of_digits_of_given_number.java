import java.util.Scanner;

public class sum_of_digits_of_given_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit: ");
    int n= sc.nextInt();
    sc.close();
    sumdigits(n);

}public static void sumdigits(int n){
    int r,sum=0;
      while(n!=0){
        r = n%10;
        sum = sum +r;
        n = n/10;
      }System.out.println("sum of the digit is:" +sum);
}
}
