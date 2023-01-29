package LeetSolutions.ValidMountainArray;
//941. Valid Mountain Array
public class Solution {
    public boolean validMountainArray(int[] arr) {
        int i = 0;
        if(arr.length<3)return false;
        if (arr[i] >= arr[i+1])return false;
        for (;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                i++;
                break;
            } else if (arr[i] == arr[i+1]) {
                return false;
            }
        }
        for (;i<arr.length;i++){//1,2,3,4,5,3,2,1
            if (arr[i-1]<=arr[i]){
                return false;
            }
        }
        return true;
    }
}
