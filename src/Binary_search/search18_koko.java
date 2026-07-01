package Binary_search;

public class search18_koko {
    public static void main(String[] args) {
//        int[] piles = {3,6,7,11};
        int[] piles = {30,11,23,4,20};
        int h = 5;

        System.out.println(koko(piles, h));
    }

    public static int koko(int[] piles, int h) {
        int start = 1;
        int end = 0;

        for(int i = 0; i < piles.length; i++){
            if(piles[i] > end){
                end = piles[i];
            }
        }

        int result = end;

        while(start <= end){
            int mid = start + (end - start) / 2;

            long hours = 0;  // ✅ changed to long
            for(int i = 0; i < piles.length; i++){
                hours = hours + (piles[i] + mid - 1) / mid;
            }

            if(hours <= h){
                result = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return result;
    }
}
