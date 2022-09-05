 class swapping {
    public static void main(String[] args){
        int a=10;
        int b = 20;
        swap(a,b);
    }
    public static void swap(int a,int b){
        System.out.println("values before swapping are: a " +a + " b:" +b);
        int c = a;
        a = b;
        b = c;
        System.out.println("values after swapping are: a " +a + " b:" +b);
    }
}
