package Arrays;
import java.util.ArrayList;
public class Arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(67);
        list.add(56);
        list.add(5);
        list.add(6);
        list.add(78);
        System.out.println(list);
        System.out.println(list.contains(67));
        list.set(1,54);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
