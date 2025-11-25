class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m  = nums2.length;
        int arr[] = new int[m+n];
        for(int i=0;i<nums1.length;i++){
            arr[i] = nums1[i];
        }

        for(int i =0;i<nums2.length;i++){
            arr[n+i] = nums2[i];
        }
        Arrays.sort(arr);
        if(arr.length %2 == 0){
            
            int mid = arr.length/2;
            double val  = (arr[mid-1] + arr[mid])/2.0;
            return val;

        }
        else  return (double)(arr[arr.length/2]);
   
    }
}