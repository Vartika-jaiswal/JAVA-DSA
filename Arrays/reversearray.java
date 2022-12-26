package Arrays;

import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int[] a={2,18,9,10,5,7,4};
        // swap(a,0,3);
        reverse(a);
        System.out.println(Arrays.toString(a));
    }static void reverse(int[] a){
        int start=0;
        int end=a.length-1;
        while(start<end){
            swap(a, start, end);
            start++;
            end--;
        }
    }
    static void swap(int a[],int index1,int index2){
        int temp;
       
            temp=a[index1];
            a[index1]=a[index2];
            a[index2]=temp;
        
    }
}
