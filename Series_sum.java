
    import java.util.Scanner;
    public class Series_sum {
    public static void main(String[] args){
        float sum = 0;
        float a = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<n;i++){
            if(i%2==0){
                a = -(float)1.0/i;
            }else{
            a = (float)1.0/i;
            sum = sum + a;
            }
        }System.out.println("sum of the series is:" +sum);
    }
}

