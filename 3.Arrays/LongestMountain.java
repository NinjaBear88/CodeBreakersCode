class Solution {
    public int longestMountain(int[] A) {
        int maxLen = 0;
        for(int peek = 1; peek < A.length - 1; peek++){
            
               if(A[peek-1] < A[peek] && A[peek] > A[peek + 1]){
                int left = peek;
                int right = peek;
                while(left - 1 >= 0 && A[left - 1] < A[left]){
                    left--;
                }
                while(right + 1 < A.length && A[right] > A[right + 1]){
                    right++;
                }
                
                int len = right - left + 1;
                maxLen = Math.max(maxLen, len);
                peek = right;
            }
        }
        return maxLen;          
    }
}