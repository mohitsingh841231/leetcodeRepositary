class Solution {
public:
    int firstUniqChar(string s) {
        unordered_map<char, int> mp;
        
        // Count frequencies
        for (char c : s) {
            mp[c]++;
        }
        
        // Find first unique
        for (int i = 0; i < s.size(); i++) {
            if (mp[s[i]] == 1) {
                return i;
            }
        }
        
        return -1;
    }
};
