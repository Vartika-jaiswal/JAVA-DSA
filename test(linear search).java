 class test{public static void main(String[] args) {
    int[] a={5,7,3,1,4,8};
    int item=1;
    int temp=0;
    for(int i=0;i<a.length;i++){
       if(a[i]==item){
        System.out.println("item " +a[i]+" found at index "+i);
        temp=temp+1;
       }
    }
       if(temp==0){
        System.out.println("itme does not found");
       }
    
}}