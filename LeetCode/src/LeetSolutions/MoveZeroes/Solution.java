package LeetSolutions.MoveZeroes;

import java.util.Arrays;

//283. Move Zeroes
public class Solution {
    public int[] moveZeroes(int[] nums) {
      int i =0;
      int j =0;
      for (;i<nums.length;i++){
          if (nums[i] != 0){
              nums[j] = nums[i];
              j++;
          }
      }
      while (j<nums.length){
          nums[j] = 0;
          j++;
      }
      return nums;
    }
}
