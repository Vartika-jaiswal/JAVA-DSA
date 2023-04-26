public class Duplicate_numbers {
    public static void main(String[] args) {
        int[] arr={9,6,4,2,3,5,7,0,1};
        Duplicate(arr);
       System.out.println(Duplicate( arr));
    }
    public static int Duplicate(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
              i++;
            }
            for(int j=0;j<arr.length;j++){
                if(arr[j]!=j+1){
                    return j+1;
                }
            }
        }
        return arr.length+1; 
       
     }
    static void swap(int[] arr,int f,int s){
         int temp=arr[f];
         arr[f]=arr[s];
         arr[s]=temp;
     }
    }

