public class Rotaedsortedarray {
    public static void main(String[] args) {
        int[] arr = {15,16,17,18,56,66,77, 2 , 3 , 6 , 12};
        int pivot = binarysearch(arr);
        int ans1 = rotationcount(arr , pivot);
        System.out.println(ans1);
    }
    static int rotationcount(int[] arr, int pivot) {
        return pivot + 1;
    }
    public static int binarysearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1] && mid < arr.length -1){
                return mid;
            }
            else if(arr[mid] < arr[mid-1] && mid > 0 ){
                return mid-1;
                }

            else if (arr[start] >= arr[mid]) {
                    end = mid -1;
                }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}

