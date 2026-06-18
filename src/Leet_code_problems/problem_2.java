package Leet_code_problems;

public class problem_2 {
    public static void main(String[] args) {
        char[] letters = {'x','x','y','y'};
        char target = 'z';

        char ans = search(letters, target);
        System.out.println(ans);
    }

    static char search(char[] letters, int target) {
        int start = 0;
        int end = letters.length - 1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(target > letters[mid]){
                start = mid + 1;
            }else if(target < letters[mid]){
                end = mid - 1;
            }
        }
        char ans = letters[start % letters.length];
        return ans;
    }
}
