package Arrays.Sorting;


public class Missing_number {
    public static void main(String[] args) {
        int[] arr={9,6,4,2,3,5,7,0,1};
        missingNumber(arr);
       System.out.println(missingNumber( arr));
    }
    public static int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
              i++;
            }
        } 
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index)
            return index;
        }
        return arr.length;
     }
    static void swap(int[] arr,int f,int s){
         int temp=arr[f];
         arr[f]=arr[s];
         arr[s]=temp;
     }
}
