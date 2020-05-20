class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1 || s.length() == 0){
            return s.length();
        }
        char[] array = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int slow = 0;
        int maxLen = 0;
        
        for(int fast = 0 ;fast < array.length; fast++){
            if(!set.contains(array[fast])){
                set.add(array[fast]);
                maxLen = Math.max(maxLen, fast - slow + 1);
              
            }else{
                while(array[slow] != array[fast]){
                    set.remove(array[slow++]);
                }
                slow++;
            }
        }
        return maxLen;
    }
}