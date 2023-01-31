package Arrays;

public class sentence_in_pangram {
    public static void main(String[] args) {
        String sentence="thequickbrownfoxjumpsoverthelazydog";
        boolean[] arr=new boolean[26];
        for(int i=0;i<sentence.length();i++){
            arr[sentence.charAt(i)-97]=true;
        }
        for(int i=0;i<26;i++){
            if(arr[i]==false ){
            System.out.println(false);
            break;
        }
            
         }
         System.out.println(true);
        
        
    }
}
