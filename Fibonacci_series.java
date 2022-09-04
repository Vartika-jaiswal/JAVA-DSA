
import java.util.Scanner;
public class Fibonacci_series
{
	public static void main(String[] args){
        int a = 0;
        int b = 1;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.close();
        for( int n=0;n<=i;n++){
            c = a+b;
             a = b;
             b = c;
        }System.out.println("fIBONACCI SERIES :" +c);
    }
}
