class Solution {
    public boolean containsDuplicate(int[] arr) {
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        Arrays.sort(arr);
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]== arr[i+1])return true;
        }
        return false;
    }
}