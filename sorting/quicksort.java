import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,3,8,7,6};
        quicksort1(arr, 0 , arr.length -1);
        System.out.println(Arrays.toString(arr));
    }
    static void quicksort1(int[] arr , int low , int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];
        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while(pivot < arr[e]){
                e--;
            }
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        quicksort1(arr , low , e  );
        quicksort1(arr , s , high);

    }

}

