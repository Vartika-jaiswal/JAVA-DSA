import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in array: ");
        int  temp;int a[] = new int[5];
        for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            int flag=0;
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }for(int i=0;i<a.length;i++){
            System.out.print( a[i]+" ");
        }sc.close();
    }
}
