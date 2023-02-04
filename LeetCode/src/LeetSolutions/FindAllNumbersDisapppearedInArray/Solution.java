package LeetSolutions.FindAllNumbersDisapppearedInArray;
import java.util.ArrayList;
import java.util.List;
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        List<Integer> a = new ArrayList<>();
        while (count<n){
            for (int i = 0; i<n;i++){
                if (nums[i] == count){
                    continue;
                }else {
                    a.add(count);
                }
                count++;
            }
        }
        return a;
    }
}
