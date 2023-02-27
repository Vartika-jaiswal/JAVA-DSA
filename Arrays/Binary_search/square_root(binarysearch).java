package Arrays.Binary_search;

 class square_root {
    public static void main(String[] args) {
        int z=8;
        System.out.println(binarysearch(z));
    }
    public static int binarysearch(int num){
        int start=1;
        int end=num;
          int ans=0;
        while(start<=end){
             int mid=start+(end-start)/2;
            
           
            if(mid<=num/mid){
                ans=mid;
                start=mid+1;
        }else{
            end=mid-1;
        }
        
    }
    return ans;
    }
}

