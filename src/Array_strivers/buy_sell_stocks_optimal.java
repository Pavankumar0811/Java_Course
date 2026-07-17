package Array_strivers;

public class buy_sell_stocks_optimal {
    static void main(String[] args) {
      int[] arr = {7,1,5,3,6,4};

        System.out.println(main1(arr));
    }

    static int main1(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int maxCur = 0, maxSoFar = 0;
        for (int i = 1; i < n; i++) {
            int diff = arr[i] - arr[i - 1];
            maxCur = Math.max(0, maxCur + diff);
            maxSoFar = Math.max(maxSoFar, maxCur);
        }
        return maxSoFar;
    }
}
