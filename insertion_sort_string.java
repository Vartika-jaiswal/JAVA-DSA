import java.util.Scanner;
public class insertion_sort_string {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elemnts in array:");
        String temp;
        int j;
        String a[] =new String[6];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextLine();
        }
        for(int i=1;i<a.length;i++){
            temp=a[i];
            j=i;
            while(j>0 && a[j-1].compareTo(temp)>0){
                a[j]=a[j-1];
                j=j-1;
            }a[j]=temp;
        }System.out.print("the sorted array is: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }sc.close();
    }
    
}
