import java.util.Scanner;

public class prime_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int temp=0;
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                temp=temp+1;
            }
        }if(temp>0){
            System.out.println("The number is not prime");
        }else{
            System.out.println("The number is prime");
        }sc.close();
    }
}
