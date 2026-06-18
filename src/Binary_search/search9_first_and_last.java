package Binary_search;

public class search9_first_and_last {
    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8,9, 10,11};
        int target = 7;

        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);

        System.out.println("First position: " + ans[0]);
        System.out.println("Last position: " + ans[1]);
    }

//    public int[] searchRange(int[] nums, int target) {
//
//        int[] ans = {-1,-1};
//
//        ans[0] = search(nums, target,true);   // 2. or else this
//        ans[1] = search(nums, target,false);
//
//        //ans[0] = start;      1 .we can also do like this
//       // ans[1] = end;
//
//        return ans;
//    }


    // this function just return index value

    public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;

        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if(target < nums[mid]) {
                end = mid-1;
            }else if(target > nums[mid]) {
                start = mid+1;
            }else{
               ans = mid;
               if(findStartIndex== true){
                   end = mid-1;
               }else{
                   start = mid+1;
               }
            }
        }
        return ans;
    }
}
