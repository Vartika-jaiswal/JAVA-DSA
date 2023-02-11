package Arrays;

import java.util.Arrays;

public class Find_Missing_positive {
    public static void main(String[] args) {
        int[] nums={3,4,-1,1};
        System.out.println("Input:"+Arrays.toString(nums));
        int n=nums.length;
        for(int i=0;i<n;i++){
            int element=nums[i];
        
        if(element>=1 && element<=n){
            int chair=element-1;
            if(nums[chair]!=element){
              int temp=nums[chair];
              nums[chair]=nums[i];
              nums[i]=temp;
              i--;
            }
        }
     } 
        for(int i=0;i<n;i++){
            if(i+1!=nums[i]){
                System.out.println(i+1);
            }
        }
    }
}
