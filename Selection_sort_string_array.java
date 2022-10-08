import java.util.Scanner;

public class Selection_sort_string_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in array:");
        String a[]= new String[5];
        int min;
        String temp;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextLine();
        }
        for(int i=0;i<a.length;i++){
            min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j].compareTo(a[min])<0){
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }sc.close();
    }
}
