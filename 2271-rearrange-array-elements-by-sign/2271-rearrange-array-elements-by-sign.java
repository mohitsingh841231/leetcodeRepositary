class Solution {
   public int[] rearrangeArray(int[] arr) {
        int Newar[] = new int[arr.length];
        int pi =0;
        int ni =1;
        for(int i =0;i<arr.length;i++){
            if(arr[i] > 0){
                Newar[pi] = arr[i];
                pi+= 2;
            }
            else{
                Newar[ni] = arr[i];
                ni +=2;
            }
            
        }
        return Newar;

   }


    
}