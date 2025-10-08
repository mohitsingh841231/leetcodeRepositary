class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        int arr[] = new int[arr1.length];
        boolean found = false;
        for(int i =0;i<arr1.length;i++){
            found =false;
            // int val = arr[i];
            for(int j =0;j<arr2.length;j++ ){
                if(arr1[i]==arr2[j]){
                    found = true;
                   
                }
                if(found && arr2[j]>arr1[i]){
                    arr[i] = arr2[j];
                    break;
                }
                

            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }
        return arr;
    }
}