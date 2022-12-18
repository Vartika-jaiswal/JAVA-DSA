package Functions;

import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        System.out.println("Enter the number of which you want to know the occurence of:");
        int o=sc.nextInt();
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==o){
                count++;
            }
            n=n/10; 
            
    }System.out.println("This number occured "+count+" times"); 
     sc.close();
}
}
