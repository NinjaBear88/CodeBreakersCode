class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0){
            return true;
        }

        int left = 0;
        int right = s.length() - 1;
        
        while(left < right){
            char charL = s.charAt(left);
            char charR = s.charAt(right);
            if(!isLetterOrDigit(charL)){
                left++;
            }else if(!isLetterOrDigit(charR)){
                right--;
            }else{
                if(toLowerCase(charL) != toLowerCase(charR)){
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }

    private boolean isLetterOrDigit(char c){
        if(('a' <= c && c <= 'z')||('A' <= c && c <= 'Z') || ('0' <= c && c <= '9')){
            return true;
        } 
        return false;
    }

    private char toLowerCase(char c){
        if('A'<= c && c <= 'Z'){
            c = (char)(c + 32);
        }
        return c;
    }
}