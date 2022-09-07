import java.util.Scanner;

public class voting_age_program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the persons age:");
        int n = sc.nextInt();
        sc.close();
        voting_age(n);
       
}
public static void voting_age(int n){
    if(n>=18){
        System.out.print("The person is eligible to vote " +n);
    }else{
        System.out.print("The person is not eligible to vote " +n);
    }
}
}
