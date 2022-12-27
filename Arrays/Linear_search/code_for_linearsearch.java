package Arrays.Linear_search;

public class code_for_linearsearch {
    public static void main(String[] args) {
        int[] arr={18,12,14,77,50};
        int item=14;
        System.out.println(linearsearch(arr,item));
        System.out.println(linearsearch2(arr,item));
        System.out.println(linearsearch3(arr,item));

     }
    //  returning index
    static int  linearsearch(int arr[],int item){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
             if(arr[i]==item){
                return i;
             }  
        }
        return -1;
        
    }
    // returning an item
    static int  linearsearch2(int arr[],int item){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
             if(arr[i]==item){
                return arr[i];
             }  
        }
        return Integer.MAX_VALUE;
        
    }
    // boolean
    static boolean  linearsearch3(int arr[],int item){
        if(arr.length==0){
            return false;
        }
        for(int i=0;i<arr.length;i++){
             if(arr[i]==item){
                return true;
             }  
        }
        return false;
        
    }
}
