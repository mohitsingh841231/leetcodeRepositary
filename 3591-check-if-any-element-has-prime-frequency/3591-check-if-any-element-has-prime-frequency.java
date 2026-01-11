class Solution {
    boolean isPrime(int n){
        
            if(n <= 1)return false;
            if(n == 2)return true;
            if(n % 2  == 0)return false;
            for(int i = 3; i*i <= n;i+=2){
                if(n%i == 0)return false;
            }
        
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int key : nums){
            if(!map.containsKey(key)){
                map.put(key,1);
            }
            else{
                int freq = map.get(key);
                map.put(key,freq+1);
            }
        }
        int freq =0;
        int idx =0;
        int arr[]  = new int[map.size()];

        for(int key : map.values()){
            if(isPrime(key)){
                return true;
            }


        }
        return false;

    }
}