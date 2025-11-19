class Solution {
    public void reverseString(char[] arr) {
        recu(arr,0,arr.length-1);
       
    }
    public static void recu(char arr[],int i,int j){
     if(i >= j)return;
  
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // while(i<j){
        //     char temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] =  temp ;
        //     i++;
        //     j--;
        // }
        recu(arr,i+1,j-1);

    }
}