import java.util.Scanner;

public class maximum_element_array {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers in array:");
        int a[]=new int[6];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }System.out.println("the maximum element is: " +max);
        sc.close();
    }
}
