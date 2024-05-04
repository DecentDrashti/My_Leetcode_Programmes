class Solution {
    public int longestIdealString(String s, int k) {
        int maxLen = 0;
        int startIdx = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int idealCount = 0;
            
            for (int j = i - k; j <= i + k; j++) {
                if (j >= 0 && j < s.length()) {
                    if (s.charAt(j) == currentChar) {
                        idealCount++;
                    }
                }
            }
            
            maxLen = Math.max(maxLen, idealCount);
            
            if (idealCount != k + 1) {
                startIdx = i + 1;
            }
        }
        
        return maxLen;
    }
}