import java.util.HashMap;
import java.util.Map;

public class AEX_FirstDuplicateValue {


    public static void main(String[] args){
        System.out.println(firstDuplicateValue(new int[]{2, 1, 5, 2, 3, 3, 4}));
    }
    static int firstDuplicateValue(int[] nums) {

        Map<Integer,Integer> num2freq = new HashMap<>();
        for(int i : nums){

            if(num2freq.putIfAbsent(i,1) !=null) return i;

        }
        return -1;

    }
}
