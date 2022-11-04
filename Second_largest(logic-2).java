 class Second_largest {
    public static void main(String[] args){
        int[] a= {6,8,2,4,3,1,5,7};
        int lar=Integer.MIN_VALUE;
        int Second_largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>lar){
                Second_largest=lar;
                lar=a[i];
            }
            else if(a[i]>Second_largest&&a[i]!=lar){
                Second_largest=a[i];
            }
            
        }
        if(Second_largest==Integer.MIN_VALUE)
        System.out.println("second largest element not found");
        else
        System.out.println("Second largest element is:" +Second_largest);
    }
}
