package Arrays;

public class house_robber {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        int n=nums.length;
        int x=nums[0];
        int y=0;
        for(int i=1; i<n; i++){
            int nx=y+nums[i];
            int ny=Math.max(x, y);
            x=nx;
            y=ny;
        }
        System.out.println( Math.max(x, y));
    }
}
