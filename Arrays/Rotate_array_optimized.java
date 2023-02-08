package Arrays;

import java.util.Arrays;

public class Rotate_array_optimized {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        int n=nums.length;
        flip(nums,0,n-1);
        flip(nums,0,k-1);
        flip(nums,k,n-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void flip(int[] nums,int s,int e){
        int temp=0;
        while(s<e){
           temp=nums[s];
           nums[s]=nums[e];
           nums[e]=temp;
           s++;
           e--;
        } 
    }
}
