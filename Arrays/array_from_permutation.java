package Arrays;

import java.util.Arrays;

public class array_from_permutation {
    public static void main(String[] args) {
        int[] nums={0,2,1,5,3,4};
        int n=nums.length;
        for(int i=0;i<n;i++){
         nums[i]=n*(nums[nums[i]]%n)+nums[i];
        }
        for(int i=0;i<n;i++){
         nums[i]=nums[i]/n;
        }
        System.out.println(Arrays.toString(nums));
    }
    
}
