import java.util.Scanner;

public class sort_array {
    public static void main(String[] args){
       int a[] = new int[5];int temp;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the elements of array");
       for(int i=0;i<5;i++){
        a[i] = sc.nextInt();
       }
       for(int i=0;i<5;i++){
        for(int j=i+1;j<5;j++){
            if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
     } System.out.print("The sorted array is:");
       for(int i =0;i<5;i++){
        System.out.print(" "+a[i]);
       }sc.close();
    } 
}
