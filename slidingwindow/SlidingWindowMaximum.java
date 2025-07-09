import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SlidingWindowMaximum {

    public static void main(String[] str){

        System.out.println("sliding window Maximum");
        int[]nums = {1,3,-1,-3,5,3,6,7} ;
        int k = 3;
//        int[] nums = {1} ;
//        int k = 1;

        maxSlidingWindow(nums,k);

    }

    public static int[] maxSlidingWindow(int[] nums, int k){

        int left = 0 , count = 0, right = 0 ;

        int max = Integer.MIN_VALUE;

        List<Integer> result = new ArrayList<Integer>();

        while(right < nums.length){

            System.out.println("left - "+left);
            System.out.println("right - "+right);
            System.out.println("count - "+count);

            if(count < k ){

               max = Math.max(max,nums[right]);
               right++;
               count++;
               System.out.println("max - "+max);


            }else{

                left++;
                right = left+1;
                count = 1;
                result.add(max);
                max = nums[left];
                System.out.println("result  - "+result);
                System.out.println("----------------");


            }
        }

        if(right == nums.length)
            result.add(max);
        System.out.println("result  - "+result);
        int[] arrayNum = new int[result.size()];

        System.out.println(result);
        for (int i = 0; i < result.size(); i++) {
            arrayNum[i] = result.get(i); // Unboxing Integer to int

        }

        return  arrayNum;
    }


    public int[] maxSlidingWindowOpt(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ri = 0; // result index

        Deque<Integer> deque = new ArrayDeque<>(); // stores indices

        for (int i = 0; i < n; i++) {

            // 1. Remove indices out of the current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // 2. Remove elements smaller than current from the rear
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // 3. Add current index to deque
            deque.offerLast(i);

            // 4. Add max (front of deque) to result
            if (i >= k - 1) {
                result[ri++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }


}
