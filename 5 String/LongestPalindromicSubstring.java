class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 2){
            return s;
        }
        int maxL = 0;
        int maxR = 0;
        
        for(int i = 0; i < s.length() - 1; i++){
            int oddStrLen = expendAroundCenter(s,i,i);
            int evenStrLen = expendAroundCenter(s,i ,i + 1);
            int maxLen = Math.max(oddStrLen, evenStrLen);
            
            if(maxLen > maxR - maxL + 1){
                maxL = i - (maxLen - 1) /2;
                maxR = i + maxLen /2;
            }
        }
        
        return s.substring(maxL, maxR + 1);
    }
    
    private int expendAroundCenter(String s, int left, int right){
        while(left >= 0 && right < s.length()){
            if(s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }else{
                break;
            }        
        }
        return right - left -1;
    }
}