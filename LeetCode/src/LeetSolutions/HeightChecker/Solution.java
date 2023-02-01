package LeetSolutions.HeightChecker;

import java.util.Arrays;
//1051. Height Checker
public class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for (int j = 0; j<heights.length;j++){
            expected[j] = heights[j];
        }
        Arrays.sort(expected);
        int count = 0;
        for (int i =0; i<heights.length;i++){
            if (heights[i] != expected[i]){
                count++;
            }
            System.out.println(expected[i]);
        }

        return count;

    }
}
