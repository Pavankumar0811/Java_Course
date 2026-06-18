package Linear_search;

public class search12 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        int start = -1;
        int end = -1;

        for(int i = 0 ; i < arr.length; i ++){
            if(arr[i] == target){
                if(start == -1){
                    start = i;
                }
                end = i;
            }

        }
        System.out.println(start+" " +end);
    }
}
