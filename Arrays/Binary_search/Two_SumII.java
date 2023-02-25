package Arrays.Binary_search;

import java.util.Arrays;

public class Two_SumII {
    public static void main(String[] args) {
        int[] numbers={2,7,11,15};
        int target=17;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
        
    }
    public static int[] twoSum(int[] numbers, int target) {
        int s=0;
        int end=numbers.length-1;
        while(s<end){
            if(numbers[s]+numbers[end]==target){
                return new int[]{s+1,end+1};
            }
            else if(numbers[s]+numbers[end]>target){
                end--;
            }else{
                s++;
            }
        }
        return new int[]{-1,-1};
    }
}
