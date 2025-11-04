class Solution {
    public int addDigits(int num) {
        int n =0;
        while(num!=0){
             n += num % 10;
             num = num/10;
                     
        }
        if(n >= 10){
              return addDigits(n);
             }
                
        return n;
    }
}