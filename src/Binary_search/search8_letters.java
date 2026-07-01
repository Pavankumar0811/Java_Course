package Binary_search;

public class search8_letters {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'f';

        char ans = nextGreatestLetters(letters,target);
        System.out.println(ans);
    }

    static char nextGreatestLetters(char[] letters, char target) {

        int start = 0;
        int end = letters.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if(target < letters[mid]) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        char ans = letters[start % letters.length];

        //return letters[start % letters.length]; or we can do this

        return ans;
    }
}
