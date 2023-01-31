package LeetSolutions.SortArrayByParity;
//905. Sort Array By Parity
public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int[] arr1 = new int[n];
        for(int a = 0; a<n;a++) {
            if (nums[a] % 2 == 0) {
                arr1[i] = nums[a];
               i++;
            } else {
                arr1[j] = nums[a];
                j--;
            }
        }
        return arr1;
    }
}
