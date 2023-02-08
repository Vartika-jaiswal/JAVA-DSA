package Arrays;

import java.util.Arrays;

public class Rotate_array {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        int n=nums.length;
        int[] ans=new int[n];
        k=k%n;
        for(int i=n-k;i<n;i++){
            ans[i-(n-k)]=nums[i];
        }
        for(int i=k;i<n;i++){
            ans[i]=nums[i-k];
        }
        
        System.out.println(Arrays.toString(ans));

    }
}
