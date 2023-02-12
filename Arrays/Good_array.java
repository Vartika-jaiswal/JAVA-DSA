package Arrays;

public class Good_array {
    public static void main(String[] args) {
        int[] nums={12,5,7,23};
        int gcd = nums[0];
        for(int i = 1; i<nums.length;i++){
            gcd = gcd(gcd, nums[i]);
            if(gcd == 1){
                System.out.println(true);
                break;
            }else{
                System.out.println(false);
            }
        }
        
    }
    public static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }

    }

