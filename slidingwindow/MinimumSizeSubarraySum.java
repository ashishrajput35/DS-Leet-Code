
public class MinimumSizeSubarraySum {

    public static void main(String[] args){

        System.out.println("***- Minimum size subarray sum -****");

//        int[] nums = {2,3,1,2,4,3};
//        int target = 7;

        int[] nums = {1,4,4};
        int target = 4;

        System.out.println(minSubArrayLen(target,nums));


    }

    public static int minSubArrayLen(int target , int[] nums){

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

      for(int right = 0 ; right < nums.length ; right++){

          sum += nums[right];

          while(sum >= target){

              minLength = Math.min(minLength,(right-left+1));

              sum -= nums[left];
              left++;

          }


        }

        if(minLength != Integer.MAX_VALUE )
            return minLength;

        return 0;
    }




}
