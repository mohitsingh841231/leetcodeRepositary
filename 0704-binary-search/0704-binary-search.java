class Solution {
    private static int find(int arr[],int idx,int k){
        if(idx == arr.length)return -1;
        if(arr[idx] == k)return idx;
        else{
            int val = find(arr,idx+1,k);
             return val;
        }
    }
    static int searchValue(int [] nums,int first,int last,int target){
        if(first > last) return -1;
        int mid = 0;
        mid = (first+last)/2;
        if(nums[mid] == target) return mid;
        else if(nums[mid]>target) return searchValue(nums , first , mid-1 , target);
        else return searchValue(nums , mid+1 , last , target);
        
    }
    static int search(int[] nums, int target) {
        // return searchValue(nums, 0 , nums.length-1 , target);
        return find(nums,0,target);
    }
}