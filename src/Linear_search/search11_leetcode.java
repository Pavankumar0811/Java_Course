package Linear_search;

public class search11_leetcode {
    public static void main(String[] args) {
        int[][] arr = {
                {1 , 2 , 3},
                {1 , 2 , 3},
                {10, 10}
        };
        int maxvalue =0;

        for(int i=0;i<arr.length;i++){
               int sum = 0;
            for(int j=0;j<arr[i].length;j++){
                sum = sum+arr[i][j];

                if(sum>maxvalue){
                    maxvalue=sum;
                }
            }

        }
        System.out.println(maxvalue);
    }
}
