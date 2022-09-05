public class add_numbers_using_return_values {
    public static void main(String[] args){
        add_numbers_using_return_values obj = new add_numbers_using_return_values();
        int x = 10;
        int y = 20;
        int get_result = obj.add(x,y);
        System.out.println(get_result);
    }
    public int add(int num1, int num2){
        int result = num1+num2;
        return result;
    }
}
