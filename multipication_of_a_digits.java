import java.util.Scanner;
public class multipication_of_a_digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit: ");
    int n= sc.nextInt();
    sc.close();
    multiplicationdigits(n);

}public static void multiplicationdigits(int n){
    int r,mul=1;
      while(n!=0){
        r = n%10;
        mul = mul *r;
        n = n/10;
      }System.out.println("sum of the digit is:" +mul);
}
}
