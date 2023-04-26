package Arrays.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_all_numbers_disappered {
       public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        findDisappearedNumbers( nums);
        System.out.println(Arrays.toString(nums));
    
    }
       public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
        
    }
     static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
 }
    }

