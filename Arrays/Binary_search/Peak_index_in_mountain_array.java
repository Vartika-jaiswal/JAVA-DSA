package Arrays.Binary_search;

public class Peak_index_in_mountain_array {
    public static void main(String[] args) {
        int[] arr={0,2,1,0};
        int ans=peakIndexInMountainArray(arr);
        System.out.println(ans);
    }  public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}
