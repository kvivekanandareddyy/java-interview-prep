import java.util.ArrayList;
import java.util.Arrays;

public class Subset {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        subsequence("" , "ab" , arr);
        System.out.println(arr);

    }
    static void subsequence(String p , String up ,ArrayList<String> arr){
        if(up.isEmpty()) {
            arr.add(p);
            return;
        }
        char ch = up.charAt(0);
        //take the element;
        subsequence(p + ch , up.substring(1) , arr);
        //ingnore the element;
        subsequence(p, up.substring(1) ,arr);
    }

}

