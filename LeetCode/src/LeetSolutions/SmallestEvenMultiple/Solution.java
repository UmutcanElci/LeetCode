package LeetSolutions.SmallestEvenMultiple;
//2413. Smallest Even Multiple

public class Solution {
    public int smallestEvenMultiple(int n) {
        if(n % 2 == 0){
            return n;
        }
        return n*2;
    }
}
//Well leet code accepts it but there's mistakes