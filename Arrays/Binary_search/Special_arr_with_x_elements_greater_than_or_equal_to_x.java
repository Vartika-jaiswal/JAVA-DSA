package Arrays.Binary_search;

public class Special_arr_with_x_elements_greater_than_or_equal_to_x {
    public static void main(String[] args) {
        int[] nums={3,5};
        System.out.println(specialArray( nums));
    }
    public  static int specialArray(int[] nums) {
        int start=0;
        int end=nums.length;
        while(start<=end){
            int mid=start+(end-start)/2;
             int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>=mid)
                count++;
            }
                if(count==mid){
                    return mid;
                }
                else if(count>mid){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        
        return -1;
    }
}
