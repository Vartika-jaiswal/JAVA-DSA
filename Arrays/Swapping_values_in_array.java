package Arrays;

import java.util.Arrays;

public class Swapping_values_in_array {
    public static void main(String[] args) {
        int[] a={3,4,5,6,7};
        swap(a,0,3);
        System.out.println(Arrays.toString(a));

    }static void swap(int[] a,int b,int c){
        int temp;
      
             temp=a[b];
             a[b]=a[c];
             a[c]=temp;
        
        
    }
}
