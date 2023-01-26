package LeetSolutions.MaxConsecutiveOnes;
//485. Max Consecutive Ones
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums){
        int n = nums.length;
        int count = 0;
        int finalCount = 0;
        int i = 0;
        while (i<n){
            if (nums[i] == 1){
                count++;
                if (count>finalCount){
                    finalCount = count;
                }
            }else {
                count = 0;
            }

            i++;
        }
        return finalCount;
    }
}
