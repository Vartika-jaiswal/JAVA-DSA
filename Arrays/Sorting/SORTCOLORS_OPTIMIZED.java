package Arrays.Sorting;

import java.util.Arrays;

public class SORTCOLORS_OPTIMIZED {
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        int n=nums.length;
        int zero=0,one=0,two=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0)
            zero++;
            if(nums[i]==1)
            one++;
            if(nums[i]==2)
            two++;
        }
        for(int i=0;i<zero;i++)
        nums[i]=0;
         for(int i=zero;i<zero+one;i++)
        nums[i]=1;
         for(int i=one+zero;i<n;i++)
        nums[i]=2;
        System.out.println(Arrays.toString(nums));
    }
}
