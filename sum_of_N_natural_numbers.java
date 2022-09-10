import java.util.Scanner;

public class sum_of_N_natural_numbers  
{  
public static void main(String[] args)   
{  
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
sc.close();
sum( num);
//executes until the condition returns true  
}  public static void sum(int num){
    int sum = 0;
    for(int i=1;i<=num;i++){
        sum =sum +i;
    }
    System.out.println("Sum of First 10 Natural Numbers is = " + sum);  
    }  
}
