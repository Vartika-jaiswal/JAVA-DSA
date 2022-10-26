import java.util.Scanner;

public class Linear_search_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[50];
        System.out.println("Enter the range in an array:");
        int n=sc.nextInt();
        System.out.println("Enter the elements in an array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to search in an array:");
        int item=sc.nextInt();
        int temp=0;
        for(int i=0;i<n;i++){
            if(a[i]==item){
                System.out.println("The element is found at "+i+" index position");
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("item not found in the list");
        }sc.close();
        
    }
}
