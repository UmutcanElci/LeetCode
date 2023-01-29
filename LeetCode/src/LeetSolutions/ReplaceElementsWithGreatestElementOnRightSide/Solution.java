package LeetSolutions.ReplaceElementsWithGreatestElementOnRightSide;
//1299. Replace Elements with Greatest Element on Right Side
public class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i = 0 ; i<arr.length-1;i++){
            int max = -1;
            for (int j =i+1;j<arr.length;j++){
                if (arr[j]>max){
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[arr.length-1] = -1;
        return arr;

        /*
        int max = -1;
        for (int i = arr.length-1;i>=0;i--){
            int temp = arr[i];
            arr[i] = max;
            if (max<temp){
                max = temp;
            }
        }
        return arr;

         */
    }
}
