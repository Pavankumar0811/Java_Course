package Array_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Arr_list {
    public static void main() {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(10);
        list.add(192);
        list.add(100);
        list.add(50);
        list.add(80);
        list.add(900);

        System.out.println(list);

        list.remove(0);

        System.out.println(list.size());

        System.out.println(list);



    }
}
