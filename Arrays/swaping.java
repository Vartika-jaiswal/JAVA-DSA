package Arrays;

import java.util.Arrays;


public class swaping {
    public static void main(String[] args) {
        
       int arr[]={2,3,4,5,6,8};
       int n=arr.length;
        swap(arr,n);
        System.out.println(Arrays.toString(arr));
        
      
    }static void swap(int arr[], int n){
        int temp;
        for(int i=0;i<n-1;i=i+2){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
         
    }
}
