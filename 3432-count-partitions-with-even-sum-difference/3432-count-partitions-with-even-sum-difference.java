class Solution {
    public int countPartitions(int[] arr) {
        // int count =0;
        // int sum =0;
        // int TotalSum = 0;
        // int left =  0;
        
        // for(int i =0;i<arr.length;i++){
        //     TotalSum = TotalSum + arr[i];
        // }

        
        // for(int i = 0;i<arr.length-1;i++){
        //          left += arr[i];
        //         sum = TotalSum - left ;
        //         if((left - sum ) % 2 == 0)count++;
        // }
        
        // return count;


        int count =0;
        for(int i =0;i<arr.length;i++){
            count += arr[i];
        }
        if(count % 2 == 0)return arr.length-1;
        else  return 0;
    }
}