public class TwoSumSecondInputArrayIsSorted {

    public static void main(String[] args){

        System.out.println("Tow sum 2nd - Input Array is sorted");

//        int[] numbers = {2,7,11,15};
//        int target = 9;

//       int[] numbers = {2,3,4};
//       int target = 6;

        int[] numbers = {-1,0};
        int target = -1;


        int[] result = twoSum(numbers , target);

        if(result.length == 2)
        System.out.println(" result - ["+result[0]+","+result[1]+"]");


    }

    public static int[] twoSum(int[] numbers, int target){

        int left = 0;
        int n= numbers.length-1;
        int right = n;

//        if(target > numbers[right])
//           return new int[]{};

        int temp = target - numbers[left];

        while(left < right ){

            if(numbers[right] == temp){

                int[] result = new int[2];
                result[0] = left+1;
                result[1] = right+1;

                return result;
            }

            else if(temp < numbers[right])
                right--;

            else if(temp > numbers[right]){

                left++;
                temp = target - numbers[left];
            }
        }

        return new int[]{};
    }
}
