class Solution {
    public void sortColors(int[] arr) {
        int count =0;
        int one =0;
        int two =0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0)count++;
            else if(arr[i] == 1)one++;
            else two++;
        }
        for(int i =0;i<arr.length;i++){
            if(count!=0){
                arr[i] = 0;
                count--;
            }
            else if(one !=0){
                arr[i] = 1;
                one--;
            }
            else if(two!=0){
                arr[i] = 2;
                two--;
            }
        }
    }
}