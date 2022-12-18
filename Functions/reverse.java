package Functions;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number you wan to reverse:");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }System.out.println("The reversed number is: "+sum);
        sc.close();
    }
}
