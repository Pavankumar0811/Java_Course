package Array_strivers;
import Array_Arraylist.Array;

import java.util.*;

public class sample {
    static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6 ,7 ,8 ,9, 10},
                {11,12,13,14,15},
        };
        System.out.println(main1(arr));
    }

    static List<Integer> main1(int[][] arr) {
      List<Integer> list = new ArrayList<>();

      int top = 0;  //1
      int bottom = arr.length - 1; //
      int left = 0;
      int right = arr[0].length - 1;  //3

      while(left <= right && top <= bottom){
          for(int i =top; i <= right; i++){
              list.add(arr[top][i]);
          }
          top++;
          for(int i = top; i <= bottom; i++ ){
              list.add(arr[i][right]);
          }
          right--;
          if(top <= bottom){
              for(int i = right;i >=left; i-- ){
                  list.add(arr[bottom][i]);
              }
          }
          bottom--;
          if(left<= right){
              for(int i = bottom; i >= top; i++ ){
                  list.add(arr[i][left]);
              }
          }
          left++;

      }
      return list;
    }
}
