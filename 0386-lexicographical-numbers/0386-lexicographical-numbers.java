class Solution {
 
    public static void DfS(int i,int n,List<Integer>arr){
        if(i> n)return;
        arr.add(i);
        for(int j =0;j<=9;j++){
            int num = i * 10 +j;
            if(num > n)return ;

            DfS( num ,n , arr);
        }
        
    }

    
    public List<Integer> lexicalOrder(int n) {
        List<Integer> arr  = new ArrayList<>();
        for(int i =1;i<=9;i++){
           DfS(i, n, arr);
        }
        return arr;
    }
}