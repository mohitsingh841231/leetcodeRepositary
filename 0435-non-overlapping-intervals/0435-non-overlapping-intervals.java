class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
         Arrays.sort(intervals,(a , b) -> a[1] - b[1]);
        int count =1;
        int endTime = intervals[0][1];
        for(int i =1;i<n;i++){
            if(endTime <= intervals[i][0]){
                endTime = intervals[i][1];
                count++;
            }
        }
        return n - count;
    }
}