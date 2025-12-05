class Solution {
    static long MOD = 1000000007;

    // recursive fast power
    public int even(long n, long value, int evenVal ){
        if(n == 0) return (int)value;

        long half = even(n / 2, value, evenVal);
        long result = (half * half) % MOD;

        if(n % 2 == 1){
            result = (result * evenVal) % MOD;
        }

        return (int)result;
    }

    // recursive fast power
    public int Prime(long n, long value, int primeVal ){
        if(n == 0) return (int)value;

        long half = Prime(n / 2, value, primeVal);
        long result = (half * half) % MOD;

        if(n % 2 == 1){
            result = (result * primeVal) % MOD;
        }

        return (int)result;
    }

    public int countGoodNumbers(long n) {
        long evenlen = (n + 1) / 2;
        long oddLen  = n / 2;

        long a = even(evenlen, 1, 5);   // computes 5^(evenlen)
        long b = Prime(oddLen, 1, 4);   // computes 4^(oddLen)

        return (int)((a * b) % MOD);
    }
}
