  class Second_smallest {
    public static void main(String[] args){
        int[] a= {6,8,2,4,3,1,5,7};
        int lar=Integer.MAX_VALUE;
        int Second_smallest=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<lar){
                Second_smallest=lar;
                lar=a[i];
            }
            else if(a[i]<Second_smallest&&a[i]!=lar){
                Second_smallest=a[i];
            }
            
        }
        if(Second_smallest==Integer.MAX_VALUE)
        System.out.println("second smallest element not found");
        else
        System.out.println("Second smallest element is:" +Second_smallest);
    }
}
 
