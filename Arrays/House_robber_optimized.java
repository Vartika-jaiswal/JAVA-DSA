package Arrays;

public class House_robber_optimized {
    public static void main(String[] args) {
        int[] nums={2,7,9,3,1};
        int n=nums.length;
        if(n==0) System.out.println(0);;
        if(n==1) System.out.println(nums[0]);
        int v1=nums[0],v2=Math.max(v1,nums[1]);
        for(int i=2;i<n;i++){
            int temp=v2;
            v2=Math.max(v2,v1+nums[i]);
            v1=temp;
        }
        System.out.println(v2);
    }
}
