package Binary_search;

public class search3_again {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        //int[] arr2 ={100,90,80,70,60,50,40,30,20,10};
        int target = 20;

        int s = 0;
        int e = arr.length-1;
        int res=-1;

        boolean isAscending =arr[0] < arr[arr.length-1];

        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid]==target){
                res = mid;
                break;
            }
            else if (isAscending){
                if(target<arr[mid]){
                    e = mid-1;
                }else{
                    s=mid+1;
                }
            }else{
                if(target<arr[mid]){
                    s =mid+1;
                }else{
                    e=mid-1;
                }
            }

        }

        if(isAscending){
            System.out.println("it is an ascending order");
        }else{
            System.out.println("is not an descending order");
        }



        if(res==-1){
            System.out.println("Target not found");
        }else{
            System.out.println("Target found at index "+res);
        }
    }
}
