import java.util.Scanner;
public class Guess_the_random_number {
    public static void main(String[] args){
        int Random_num = 5;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n>Random_num){
            System.out.println("TOO HIGH! TRY AGAIN");
        }else if(n<Random_num){
            System.out.println("TOO LOW! TRY AGAIN");
        }else if(n==Random_num){
            System.out.println("YOUR GUESS IS CORRECT!!");
        }
}
}