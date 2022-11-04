import java.util.Scanner;
public class Second_smallest_element_array {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers in array:");
        int a[]=new int[8];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            
        }System.out.print("The sorted array is: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println("Second Smallest element is:"+a[1]);
        sc.close();
}
}

