
import java.util.Scanner;

public class max_min_array {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }int max = arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }System.out.println("max element is:"+max);
        sc.close();
    }
}
