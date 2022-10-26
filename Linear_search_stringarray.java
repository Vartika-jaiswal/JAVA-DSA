import java.util.Scanner;
public class Linear_search_stringarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] a=new String[50];
        System.out.println("Enter the range in an array:");
        int n=sc.nextInt();
        System.out.println("Enter the  string elements in an array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextLine();
        }
        System.out.println("Enter the element you want to search in an array:");
        String item=sc.nextLine();
        int temp=0;
        for(int i=0;i<n;i++){
            if(a[i].equals(item)){
                System.out.println("The element is found at "+i+" index position");
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("item not found in the list");
        }sc.close();
        
}
}