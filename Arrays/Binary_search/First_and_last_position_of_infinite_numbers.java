package Arrays.Binary_search;

public class First_and_last_position_of_infinite_numbers {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160};
        int target=10;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target ){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
