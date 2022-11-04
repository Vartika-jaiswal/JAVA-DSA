import java.util.Scanner;
public class minimum_elelment_array {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers in array:");
        int a[]=new int[4];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }System.out.println("the Minimum element is: " +min);
        sc.close();
    }
}
