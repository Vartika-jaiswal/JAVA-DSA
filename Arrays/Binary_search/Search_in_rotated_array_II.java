package Arrays.Binary_search;

public class Search_in_rotated_array_II {
    public static void main(String[] args) {
        int[] nums={2,5,6,0,0,1,2};
        int target=0;
        System.out.println(search(nums,target));
    }static int search(int[] nums, int target) {
        int pivot = findPivotWithduplicates(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

    // this will not work in duplicate values
    static int findPivotWithduplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
           
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
           if(arr[mid]==arr[start] && arr[mid]==arr[end]){
            if(arr[start]>arr[start+1]){
                return start;
            }
            start++;
            if(arr[end]<arr[end-1]){
                return end-1;
            }
            end--;
           }
           else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
            start=mid+1;
           }else{
            end=mid-1;
           }
        }
        return -1;
    }
}
