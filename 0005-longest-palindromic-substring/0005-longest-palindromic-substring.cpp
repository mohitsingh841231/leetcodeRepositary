class Solution {
public:
    pair<int,int> checkEven(string& s , int i , int j){
        while(i >= 0 && j < s.size()){
            if(s[i] == s[j]){
                i-- , j++;
            }
            else break;
        }

        return {i+1 , j-1};
    }
    pair<int,int> checkOdd(string& s , int i , int j){
        while(i >= 0 && j < s.size()){
            if(s[i] == s[j]){
                i-- , j++;
            }
            else break;
        }

        return {i+1 , j-1};
    }
    string longestPalindrome(string s) {
        int n = s.size();

        pair<int,int> ans = {0,-1};

        for(int i = 0 ; i < n ; i++){
            pair<int,int> even = checkEven(s , i , i+1);
            pair<int,int> odd = checkOdd(s , i , i);

            int lenEve = even.second-even.first+1;
            int lenOdd = odd.second-odd.first+1;

            if(ans.second-ans.first+1 < max(lenEve , lenOdd)){
                if(lenEve > lenOdd){
                    ans.first = even.first;
                    ans.second = even.second;
                }
                else {
                    ans.first = odd.first;
                    ans.second = odd.second;
                }
            }
        }

        return s.substr(ans.first , ans.second-ans.first+1);
    }
};