import java.util.Scanner;
public class kth_largest_element_array {
    public static void main(String[] args){
        Scanner  sc =new Scanner(System.in);
        System.out.println("Enter the range of array:");
        int a[] = new int[1000];
        int r=sc.nextInt();
        System.out.println("Enter the elements of array:");
        for(int i=0;i<r;i++){
            a[i] = sc.nextInt();      
          } 
          System.out.println("Enter the kth largest element of array which you want to search:");
          int k=sc.nextInt();
          int temp;
          for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==k-1){
                System.out.println(k+" largest element is: "+a[i]);
                break;
            }
        } System.out.println("the sorted array till kth element is: ");
        for(int i=0;i<r;i++){
            
                System.out.print(a[i]+ " ");
             
        }
      
          sc.close();

    }
}

