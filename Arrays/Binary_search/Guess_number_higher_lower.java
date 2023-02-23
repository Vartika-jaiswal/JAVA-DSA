package Arrays.Binary_search;

public class Guess_number_higher_lower {
   public static void main(String[] args) {
        int n=10;
       
       System.out.println(binarysearch(n,6));
   }
        public static int binarysearch(int num,int guess){
              int start=1;
              int end=num;
              while(start<=end){
                  int mid=start+(end-start)/2;
                  if(guess(mid)==0){
                      return mid;
                  } 
                  if(guess(mid)==1){
                      start=mid+1;
                  }else{
                      end=mid-1;
                  }
              }
              return -1;
        }
        private static int guess(int mid) {
            return 0;
        }
    }

