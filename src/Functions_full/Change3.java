package Functions_full;

import java.util.Arrays;

public class Change3 {
    public static void main() {
        int[] arr = {1,2,34,5,6,7,8,9,10};
        change_array(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change_array(int[] arr) {
        arr[2] = 89;

        // it will only change in arrays not in string and interger because string cannot be modified
        // it cannot be chaged in premetive datatype in non premitive like array we can change in non premative like string cannot be changed
    }

}
