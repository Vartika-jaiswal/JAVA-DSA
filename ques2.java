import java.util.Scanner;
public class ques2 {
    public static void main(String[] args){
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<n;i++){
            sum = sum + (float)1.0/i;
        }System.out.println("sum of the series is:" +sum);
    }
}
