package Arrays.String;

public class Palin_String {
    public static void main(String[] args) {
        String str="abcdcba";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
     str=str.toLowerCase();
     if(str==null || str.length()==0){
        return true;
     }
     for(int i=0;i<str.length();i++){
        char start=str.charAt(i);
        char end=str.charAt(str.length()-1-i);
        if(start!=end){
            return false;
        }
     }
     return true;
    }
}
