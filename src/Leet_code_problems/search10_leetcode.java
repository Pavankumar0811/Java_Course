package Leet_code_problems;

public class search10_leetcode {
    static void main(String[] args) {

        int[] arr = {121, 12, 14, 1532, 100, 200};

        int count =0;
        for(int num:arr){     // for each loop
            int digit=0;

            while(num>0){
                num = num /10;
                digit++;
            }
            if(digit % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
