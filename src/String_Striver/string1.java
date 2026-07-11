package String_Striver;

public class string1 {
    static void main(String[] args) {
      String s = "A man, a plan, a canal: Panama";

        System.out.println(main1(s));
    }

    static boolean main1(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            // skip non-alphanumeric from left
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            // skip non-alphanumeric from right
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            // compare characters
            if(Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
