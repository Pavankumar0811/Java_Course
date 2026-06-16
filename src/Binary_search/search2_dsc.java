package Binary_search;

public class search2_dsc {
    public static void main(String[] args) {
        int[] arr = {100,90,80,70,60,50,40,30,20,10};

        int target = 60;
        int start = 0;
        int end = arr.length-1;
        int result= -1;

        while(start<=end){
            int mid = (start+end)/2;   // 5
            if(target == arr[mid]){
                result = mid;
                break;
            }else if(target<arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        if(result!=1){
            System.out.println("found at index " + result);
        }else{
            System.out.println("not found");
        }
    }
}
