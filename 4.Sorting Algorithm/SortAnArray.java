class Solution {
    public int[] sortArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return nums;
        }
        quickSort(nums,0 , nums.length -1);
        return nums;
        
    }
    
    private void quickSort(int[] array, int left, int right){
        if(left >= right) return;
        
        Random rand = new Random();
        int pivotIndex = left + rand.nextInt(right - left + 1);
        int mid = partition(array, left, right, pivotIndex);
        quickSort(array, left, mid - 1);
        quickSort(array, mid + 1, right);
        
    }
    private int partition(int[] array, int left, int right, int pivotIndex){
        int rightBoundary = right;
        int pivot = array[pivotIndex];
        swap(array, rightBoundary, pivotIndex);
        while(left <= right){
            if(array[left] < pivot){
                left++;
            }else if(array[right] >= pivot){
                right--;
            }else{
                swap(array, left, right);
                left++;
                right--;
            }
        }
        swap(array,left, rightBoundary);
        return left;
    }
    
    private void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}