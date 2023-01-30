package Arrays;

public class numidenticalpairs {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
    int n=nums.length;
        int count=0;
        int j=nums.length-1;
        for(int i=0;i<n;i++){
        if(j<i){
            j=nums.length-1;
        }
        
            while(i<j){
            if(nums[i]==nums[j]){
                count++;
            }
            j--;
        }
        }
        System.out.println(count);
    }
}
