package Arrays.Linear_search;

public class Search_in_range {
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        System.out.println(searchrange(arr,1,4));
    }static int searchrange(int arr[],int start,int end){
        int item=-7;
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==item){
                return i;
            }
        } 
        return -1;
    }
}
