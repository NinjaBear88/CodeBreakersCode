class Solution {
    public boolean canJump(int[] nums) {
        int maxdist = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(i > maxdist){
                return false;
            }else if(maxdist > nums.length){
                return true;
            }else{
                maxdist = Math.max(maxdist, i + nums[i]);
            }
        }       
        return true;
        
    }
}