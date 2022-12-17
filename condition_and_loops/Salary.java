package condition_and_loops;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary:");
        int sal =sc.nextInt();
        if(sal>10000){
            sal=sal+2000;
            System.out.println("The salary is:"+sal);
        }else{
            sal=sal+1000;
            System.out.println("The salary is:"+sal);
        }sc.close();
    }
}
