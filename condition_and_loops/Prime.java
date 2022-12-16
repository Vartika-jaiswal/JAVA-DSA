package condition_and_loops;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int flag=0;
         for(int i=2;i<num;i++){  
            if(num%i==0){
            System.out.println("number is not prime");
            flag=1;
            break;
            }
         } if(flag==0){
            System.out.println("num is prime");
         }sc.close();
}
}
