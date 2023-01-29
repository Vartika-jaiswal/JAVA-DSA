package Arrays;

import java.util.Arrays;

public class runningsumarray {
    public static void main(String[] args) {
        int [] nums={1,2,3,4};
            int n=nums.length;
            int sum=0;
            for(int i=0;i<n;i++){
                sum=sum+nums[i];
                nums[i]=sum;
            }
            System.out.println(Arrays.toString(nums));
    }
            
}
