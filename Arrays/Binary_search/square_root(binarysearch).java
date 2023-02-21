package Arrays.Binary_search;

 class square_root {
    public static void main(String[] args) {
        int x=8;
        System.out.println(binarysearch(x));
    }
    public static int binarysearch(int n){
        int start=1;
        int end=n;
          int ans=0;
        while(start<=end){
             int mid=start+(end-start)/2;
            
           
            if(mid<=n/mid){
                ans=mid;
                start=mid+1;
        }else{
            end=mid-1;
        }
        
    }
    return ans;
    }
}

