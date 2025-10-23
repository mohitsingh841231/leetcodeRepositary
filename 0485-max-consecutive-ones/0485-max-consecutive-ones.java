class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int count =0;
        int maxVal =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == 1){
                count++;

            }
            else if(maxVal<count){
                maxVal = count;
                count =0;
            }
            else{
                count =0;
            }
        }
        if(maxVal<count)maxVal = count;
        return maxVal;
    }
}