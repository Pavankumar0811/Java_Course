package Array;

public class union_using_pointers {
    static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 6, 7};

        main1(arr1, arr2);
    }

    public static void main1(int[] arr1 , int[] arr2) {
        int i = 0;  // pointer for arr1
        int j = 0;  // pointer for arr2
        int prev = Integer.MIN_VALUE;  // track last printed element

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                if(arr1[i] != prev){     // avoid duplicates
                    System.out.print(arr1[i] + " ");
                    prev = arr1[i];
                }
                i++;
            }else{
                if(arr2[j] != prev){     // avoid duplicates
                    System.out.print(arr2[j] + " ");
                    prev = arr2[j];
                }
                j++;
            }
        }

        // remaining elements of arr1
        while(i < arr1.length){
            if(arr1[i] != prev){
                System.out.print(arr1[i] + " ");
                prev = arr1[i];
            }
            i++;
        }

        // remaining elements of arr2
        while(j < arr2.length){
            if(arr2[j] != prev){
                System.out.print(arr2[j] + " ");
                prev = arr2[j];
            }
            j++;
        }
    }
}
