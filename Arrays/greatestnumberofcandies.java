package Arrays;

import java.util.ArrayList;

public class greatestnumberofcandies {
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        ArrayList<Boolean> list = new ArrayList<>();
        int n=candies.length;
		int max=Integer.MIN_VALUE;

		for(int i=0;i<n;i++){
			if(candies[i]>max)
				max=candies[i];
    }
		for(int i=0;i<n;i++){
			if(extraCandies+candies[i] >=max)
			   list.add(true);
			else
				list.add(false);

		}

		System.out.print(list);
    }
}
