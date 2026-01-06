class Solution {
    boolean canIt(int arr[],int mid, int high){
        long total = 0;
        for(int ele : arr){
            total += ele/mid;
            if(ele %mid != 0){
                total++;
            }
        }
        return total <= high;

    }
    public int minEatingSpeed(int[] arr, int h) {
        int low =1;
        int high =Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(high < arr[i]){
                high = arr[i];
            }
        }
        while(low <= high ){
            int mid = low + (high-low)/2;
            if(canIt(arr,mid,h)){
                high = mid-1;
                
            }
            else {
                low  = mid + 1;
            }

        }
        return low;

    }
}