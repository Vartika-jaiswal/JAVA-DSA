package Arrays;

public class richestpersonarray {
    public static void main(String[] args) {
        int[][] accounts={{1,5},{7,3}};
        System.out.println(maxwealth(accounts));
    }
    public static int maxwealth(int[][] accounts){
        
                   
                int max=Integer.MIN_VALUE;
                
                for(int i=0;i<accounts.length;i++){
                    int sum=0;
                    for(int j=0;j<accounts[i].length;j++){
                        sum+=accounts[i][j];
                    }
                
                if(sum>max){
                    max=sum;
                }
             }
                return max;
            }
        }
    
