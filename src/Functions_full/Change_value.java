package Functions_full;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Change_value {
    public static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        change_value(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change_value(int[] nums) {
        nums[0]=99;
    }
}
