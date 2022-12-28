package Arrays.Linear_search;

public class minimum_number {
    public static void main(String[] args) {
        int[] arr={18,12,-7,-10,3,14,28};
        min(arr);
        System.out.println(min2(arr));
    }
    static void min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
               min=arr[i];
            }
        }System.out.println("The minimum element is:" +min);
    }
    static int min2(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }return min;
    }
}
