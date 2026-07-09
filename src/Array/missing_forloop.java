package Array;

public class missing_forloop {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};

        System.out.println(main1(arr1));
    }

    public static int main1(int[] arr1) {
        for(int i = 1; i < arr1.length;i ++){
            int flag = 0;
            for(int j = 0 ; j < arr1.length; j++){
                if(arr1[j] == i){
                   flag=1;
                   break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return arr1.length+1;
    }
}
