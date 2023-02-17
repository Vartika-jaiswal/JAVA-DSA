package Arrays.Binary_search;

public class Rotation_count {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }
    public static int countRotations(int[] arr){
        int pivot=findPivot(arr);
        if(pivot==-1){
            return 0;
        }
        return pivot+1;
    }
    private static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
