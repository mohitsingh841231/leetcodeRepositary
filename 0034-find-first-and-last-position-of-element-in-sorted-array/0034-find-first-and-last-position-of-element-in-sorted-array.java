class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = findFirst( nums,0,target);
        int last = findSec(nums,0,target);

        return new int[]{first,last};
    }


    private  int findFirst(int arr[],int idx,int k) {
        if (idx == arr.length) return -1;
        if (arr[idx] == k) {
            return idx;
        } else {
            int val = findFirst(arr, idx + 1, k);
            return val;
        }
    }
    private int findSec(int [] arr ,int idx ,int k){
        if(idx == arr.length)return -1;
        int val1 = findSec(arr,idx+1,k);
        if(val1== -1){
            if(arr[idx] == k){
                return idx;
            }
            else{
                return -1;
            }

        }
        else return val1;
    }
}