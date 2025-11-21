class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int value = 0;
        for(int i =1;i<=arr.length;i++){
            value += i;


        }
//        System.out.println(value);
        int arrVal = 0;
        for(int i =0;i<arr.length;i++){
            arrVal += arr[i];
        }
        System.out.println(arrVal);
        return value - arrVal;
    }
}