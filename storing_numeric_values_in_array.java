public class storing_numeric_values_in_array {
    public static void main(String[] args){
        int[] a = new int[10];
        for(int i=0;i<10;i++){
            a[i] = i;
        }
        for(int i=0;i<10;i++){
            System.out.println(a[i]);
        }
    }
}
