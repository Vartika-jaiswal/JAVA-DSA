public class order_agnostic_binarysearch {
    public static void main(String[] args) {
        int target=45;
        int arr[]={68,56,45,33,10,8,6,5,3};
        int ans=binary_search(arr,target);
        System.out.println(ans);
    } static int binary_search(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        boolean isasc= arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isasc){
                if(arr[mid]>target){
                    end=mid-1;
                }else if(arr[mid]<target){
                    start=mid+1;
                }
            }else{
                if(arr[mid]<target){
                    end=mid-1;
                }else if(arr[mid]>target){
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
