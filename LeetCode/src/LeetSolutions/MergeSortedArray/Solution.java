package LeetSolutions.MergeSortedArray;

import java.util.*;
//88. Merge Sorted Array
public class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];//Temp holder
        int i= 0,k = 0,j= 0;
        while (i<m){
            arr[k] = nums1[i];
            k++;
            i++;
        }
        while (j<n){
            arr[k] = nums2[j];
            k++;
            j++;
        }
        Arrays.sort(arr);
        for (int a = 0; a<m+n;a++){
            nums1[a] = arr[a];
        }
        return nums1;//The problem wants to return nums1, so we should wrap all the values there
    }
}
