package Linear_search;

public class search13_mountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};

        int max = arr[0];

        for(int i = 1;i<arr.length;i++){
            if(max<arr[i]){
                max = i;
               // max = arr[i];
            }
        }
        System.out.println(max);
    }
}
