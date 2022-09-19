public class average_value_array {
    public static void main(String[] args){
        double array[] = {10,2,3,4.3,5.6,6,7,8,9};
        int n=array.length;
        averagevalue(array,n);
    }public static void averagevalue(double array[],int n){
        double sum = 0 ;
        double Average = 0;
        for(int i=0;i<n;i++){
            sum+=array[i];
             Average = sum/n;
        } System.out.println("The average of the given values in array is"+Average);
    }
}
