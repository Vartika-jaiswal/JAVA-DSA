public class area_of_rectangle_and_circle {
    public static void main(String[] args){
        int l = 10;
        int w = 50;
        float r = 2.5f;
        int rectangle_area = area(10,50);
        float circle_area = area(r);
        System.out.println("Area of rectangle:" +rectangle_area);
        System.out.println("Area of cirlce:" +circle_area);
}
    public static int area(int n1, int n2){
    int result = n1*n2;
    return result;

}
public static float area(float n){
    float result = 3.14f*n*n;
    return result;

}
}