package Arrays;

public class findeven_num_of_digits {
    public static void main(String[] args) {
        int[] nums={555,901,482,1771};
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
