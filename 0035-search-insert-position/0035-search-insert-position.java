class Solution {
    public int searchInsert(int[] arr, int target) {
        int st =0,end =arr.length-1;
        while(st<=end){
            int mid = (st+end)/2;
            if(arr[mid]== target)return mid;
            else if(arr[mid]>target)end = mid-1;
            else st = mid+1;
        }
        return end+1;
    }
}