class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = 0;
        int k = nums.length - 1;
        
        while(j<=k){
            if(nums[j] == 0){
                swap(nums,i,j);
                i++;
                j++;
            }else if(nums[j] == 1){
                j++;
            }else{
                swap(nums,j,k);
                k--;
            }
        }
        
    }
    
    private void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}