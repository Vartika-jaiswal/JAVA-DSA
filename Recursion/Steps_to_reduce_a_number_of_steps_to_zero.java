package Recursion;

public class Steps_to_reduce_a_number_of_steps_to_zero {
    public static void main(String[] args) {
        int num=41;
        System.out.println(numberOfSteps( num));
    }
    public int numberOfSteps(int num) {
        return helper(num,0);
    }
    private int helper(int num,int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }
}
