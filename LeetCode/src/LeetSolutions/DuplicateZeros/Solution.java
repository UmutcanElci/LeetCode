package LeetSolutions.DuplicateZeros;

import java.util.HashMap;
//1089. Duplicate Zeros
public class Solution {
    public int[] duplicateZeros(int[] arr) {
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == 0){
                for (int j = arr.length-1;j>i;j--){
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
        return arr;
        /*
        shiftRight(int[] arr,int i){
        for(int j = arr.length-1); j>i; j--{
        arr[j] = arr[j-1];
         */
    }
}
