package Arrays;

import java.util.Arrays;

public class Smaller_num_than_current {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        int n = nums.length;
        int [] res=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[j]<nums[i])
                count++;
            }
            res[i]=count;
        }
        System.out.println(Arrays.toString(res));
    }
}
