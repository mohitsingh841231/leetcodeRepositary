class Solution {
    public int countTriples(int n) {
        int a = 1;
        int b = 1;
        int c = 1;
        int count =0;
        for(int i =1; i<=n;i++){
            for(int j =1;j<=n;j++){
                a = i*i;
                b = j * j;
                c = a+b;
                int root = (int)Math.sqrt(c);
                if(root * root == c && root <= n)count++;

            }


        }
        return count;
    }
}