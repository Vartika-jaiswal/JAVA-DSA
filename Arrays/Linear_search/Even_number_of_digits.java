package Arrays.Linear_search;
// given an array of nums of integers,return how many of them contains an even number of digits?
public class Even_number_of_digits {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findnumbers(nums));
    }
    static int findnumbers(int[] nums){
        int count=0;
          for(int num:nums){
            if(even(num)){
                count++;
            }
          }
         return count;  
    }
    static boolean even(int num){
        int numofdigits=digit(num);
        return numofdigits%2==0;
    }
    static int digit(int num){
        int count=0;
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return -1;
        }
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }

}
