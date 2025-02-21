public class RotateArray {

    public void rotate(int[] nums, int k) {

        int n = nums.lenght;

        k = n % k;



    }


    public static void main (String[] arg){

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        RotateArray obj = new RotateArray();
        obj.rotate(nums,k);
    }
}
