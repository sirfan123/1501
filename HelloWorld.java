import java.util.ArrayList;
import java.util.HashMap;


public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Integer> arr1 = new ArrayList<Integer>(5);
        String hi = "hi";
        map.put(hi, 5);
        System.out.println(map.get(hi));
        System.out.println("it works");
        System.out.println("wow" + " "+ hi);
        //
    }
}