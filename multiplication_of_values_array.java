public class multiplication_of_values_array {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6,5,8,6,10};
        int mul = 1;
        for(int i:a){
            mul=mul*i;
            
        }System.out.println("The sum of given values is:"+mul);
    }
}
