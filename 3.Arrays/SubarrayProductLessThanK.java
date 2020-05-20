class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int slow = 0;
        int product = 1;
        int count = 0;
        for(int fast = 0; fast < nums.length; fast ++){
            product = product * nums[fast];
            while(slow <= fast && product >= k){
                product = product / nums[slow];
                slow++;
            }
            count += fast - slow + 1;
        }
        
        return count;
    }
}