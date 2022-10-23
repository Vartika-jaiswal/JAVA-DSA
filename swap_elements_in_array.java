import java.util.Scanner;
public class swap_elements_in_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range:");
        int n=sc.nextInt();
        System.out.println("Enter the elements in an array:");
        int[] a = new int[50];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        swap(a,n);
        sc.close();
    }static void swap(int a[],int n ){
        int temp;
        for(int i=0;i<n-1;i=i+2){
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
            
        }
    }
    
    
}
