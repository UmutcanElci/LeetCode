package LeetSolutions.FindAllNumbersDisapppearedInArray;
import java.util.*;

//448. Find All Numbers Disappeared in an Array
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (Integer t : nums){
            s.add(t);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i<nums.length;i++){
            if (!s.contains(i)){
                list.add(i);
            }
        }
        return list;

    }
}
