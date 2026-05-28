package recursion;

import java.util.Arrays;

public class meargesort {
    public static void main(String[] args) {
        int[] arr = {6,4,5,1,2,3,7};
        System.out.println(Arrays.toString(meargesort(arr)));
    }
    static int[] meargesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = meargesort(Arrays.copyOfRange(arr , 0 , mid ));
        int[] right = meargesort(Arrays.copyOfRange(arr, mid , arr.length));

        return meargesort(left , right);
    }

    private static int[] meargesort(int[] first , int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

}

