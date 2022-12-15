package Functions;

public class Stringfunction {
    public static void main(String[] args) {
        String personalised=greet("Vartika jaiswal!");
        System.out.println(personalised);
    }
    static String greet(String name){
        String message="Hello "+name;
        return message;
    }
    
}
