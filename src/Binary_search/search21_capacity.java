package Binary_search;


// it is same as split largest sum


public class search21_capacity {

    static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7};
        int days = 3;

        System.out.println(search(weights, days));
    }

    public static int search(int[] weights , int days) {
        int start = 0;
        int end = 0;

        // find start = max weight, end = sum of weights
        for(int i = 0; i < weights.length; i++){
            start = Math.max(start, weights[i]);
            end += weights[i];
        }

        int result = end;

        while(start <= end){
            int mid = start + (end - start) / 2;

            int daysNeeded = 1;
            int currentLoad = 0;

            for(int i = 0; i < weights.length; i++){
                if(currentLoad + weights[i] > mid){
                    daysNeeded++;
                    currentLoad = 0;   // if i want to run with else use this currentload = weights[i];
                }                      // here else
                    currentLoad += weights[i];

            }

            if(daysNeeded <= days){
                result = mid;       // capacity works, try smaller
                end = mid - 1;
            }else{
                start = mid + 1;    // capacity too small, go bigger
            }
        }
        return result;
    }
}
