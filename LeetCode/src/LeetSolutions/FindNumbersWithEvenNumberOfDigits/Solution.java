package LeetSolutions.FindNumbersWithEvenNumberOfDigits;
//1295. Find Numbers with Even Number of Digits
public class Solution {
    public int findNumbers(int[] nums) {
        int i = 0;
        int digit = 0;
        int evenDigitCount = 0;
            while (i<nums.length){
                while (nums[i] != 0){
                    nums[i] = nums[i] / 10;
                    digit++;
                }
                if (digit % 2 == 0){
                    evenDigitCount++;
                }
                digit = 0;
                i++;
            }
            return evenDigitCount;

    }
}
