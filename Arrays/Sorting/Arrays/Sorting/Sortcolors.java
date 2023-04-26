package Arrays.Sorting;

import java.util.Arrays;

public class Sortcolors {
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        int x = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if (nums[i] == 0){
                int temp = nums[x];
                nums[x] = nums[i];
                nums[i] = temp;
                x++;
            }
        }
        for(int i = x ; i<nums.length ; i++){
            if (nums[i] == 1){
                int temp = nums[x];
                nums[x] = nums[i];
                nums[i] = temp;
                x++;
            }
        }    
        System.out.println(Arrays.toString(nums));
    }
}
