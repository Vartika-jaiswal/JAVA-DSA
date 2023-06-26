package Recursion.String;

public class Stream2(skip_no_of_a's) {
     public static void main(String[] args) {
        System.out.println(skip("baccah"));
    }
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
          return skip(up.substring(1));
        }
        else{
            return ch+skip(up.substring(1));
        }
    }
}
