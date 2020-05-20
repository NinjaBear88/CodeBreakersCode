class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> complement = new HashMap<>();
        
        for(int i = 0; i< nums.length; i++){
            int comp = target - nums[i];
            if(!complement.containsKey(comp)){
                complement.put(nums[i], i);
            }else{
               
                return new int[] {complement.get(comp),i};
                
            }
        }
        
        return null;
    }
}