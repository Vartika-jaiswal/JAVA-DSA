import java.util.Scanner;

public class Factors_of_a_number {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int n = sc.nextInt();
    sc.close();
    Factornumber(n);
}public static void Factornumber(int n){
    for(int i=1;i<=n;i++){
        if(n%i==0){
            System.out.println(i);
        }
    }
}
}
