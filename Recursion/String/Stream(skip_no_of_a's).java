package Recursion.String;

public class Stream(skip_no_of_a's) {
    public static void main(String[] args) {
        skip("","baccah");
    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
          skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
}
