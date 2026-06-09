package Array_Arraylist;

public class Array {
    public static void main() {
        int[] arr = new int[5];
        System.out.println(arr[0]);    // it will always give 0 for every memory allocation
        arr[0] = 1;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 4;
        arr[4] = 55;
        System.out.println(arr[4]);

        String[] name = new String[5];
        System.out.println(name[0]);   // it will always give null for every memory allocation

        name[0] = "Rakshitha";
        name[1] = "Pavan";
        name[2] = "bhavana";
        name[3] = "akshitha";
        name[4] = "bhumi";
        System.out.println(name[3]);
    }
}
