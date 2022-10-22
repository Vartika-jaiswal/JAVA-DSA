
 class anonymous_array_sum {
    public static void main(String[] args){
        sum(new int[]{10,20,30});
    
    }
     public static void sum(int[] n){
        int total=0;
         for(int i:n){
            total=total+i;
            
         }System.out.println(" Sum of the anonymous array is:"+total);
    }
}
