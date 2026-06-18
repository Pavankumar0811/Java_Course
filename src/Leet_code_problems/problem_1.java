package Leet_code_problems;

//peak index in a mountain array

public class problem_1 {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3,2,1};

        int ans = mount(arr);

        System.out.println(ans);
    }


    static int mount(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                result = mid;
                end = mid - 1;
            }
        }
        return result;
    }
}

