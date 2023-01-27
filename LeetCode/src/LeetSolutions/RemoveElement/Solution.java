package LeetSolutions.RemoveElement;
//27. Remove Element
public class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        while (i<n){
            if (nums[i] == val){//[1,2,2,3,4,5] val = 2
                nums[i] = nums[n-1];//[1,5,2,3,4,5]
                n--;//[1,5,2,3,4]
            }else {
                i++;
            }
        }
        return i;
    }
}
