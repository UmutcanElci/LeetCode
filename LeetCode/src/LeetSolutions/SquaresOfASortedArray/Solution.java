package LeetSolutions.SquaresOfASortedArray;
import java.util.Arrays;
//977. Squares of a Sorted Array
public class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i<nums.length;i++){
         nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
