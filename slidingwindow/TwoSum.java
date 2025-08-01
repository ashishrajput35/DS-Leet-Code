import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args){

        System.out.println("***- Two sum -****");

//        int[] nums = {2,7,11,15};
//        int target = 7;

        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(twoSum(nums,target));


    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }


        throw new IllegalArgumentException("No two sum solution");

    }


}
