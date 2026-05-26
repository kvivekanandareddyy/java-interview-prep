package vivek;

public class linearsearch {
    public static void main(String[] args) {
        int target = 6;
        int[] arr = { 2, 3, 5, 7, 8, 9,6,8};
        System.out.println(liner(arr, target , 0 ));
    }
    static int liner(int[] arr , int target , int i){
        if(i > arr.length - 1){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return liner(arr , target , i + 1);
    }
}

