package Array_strivers;

public class Max_consercutiveones {
    static void main(String[] args) {
        int[] arr ={1,1,0,1,1,1};

        System.out.println(main1(arr));
    }

    static int main1(int[] arr) {
        int count = 0;
        int maxnum = 0;

       for(int i = 0; i < arr.length; i++){
           if(arr[i] == 1){
               count ++;

               if(count > maxnum){
                   maxnum = count;
               }
           }else{
               count = 0;
           }
       }
       return maxnum;
    }
}
