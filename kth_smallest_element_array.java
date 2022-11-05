import java.util.Scanner;
public class kth_smallest_element_array {
    public static void main(String[] args){
        Scanner  sc =new Scanner(System.in);
        
        int a[] = new int[10];

        System.out.println("Enter the elements of array:");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();      
          } 
          System.out.println("Enter the kth smallest element of array which you want to search:");
          int k=sc.nextInt();
          int temp;
          for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==k-1){
                System.out.println(k+" Smallest element is: "+a[i]);
                break;
            }
        } System.out.println("the sorted array till kth element is: ");
        for(int i=0;i<a.length;i++){
            
                System.out.print(a[i]+ " ");
             
        }
      
          sc.close();

    }
}
 
