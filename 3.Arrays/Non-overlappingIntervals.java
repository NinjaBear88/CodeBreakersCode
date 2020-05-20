class Solution {
    class myComparator implements Comparator<int[]>{
        public int compare(int[]a, int[]b){
            if(a[0] == b[0]) return 0;
            return a[0] < b[0] ? -1 : 1;
        }
    }

    public boolean isOverlapping(int[]a, int[]b){
        return a[1] > b[0];
    }
    
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0){
            return 0;
        }
        
        Arrays.sort(intervals, new myComparator());
        int[] dp = new int[intervals.length];
        dp[0] = 1;
        int res = 1;
        for(int i = 1; i < dp.length; i++){
            dp[i] = 1;
            for(int j = i- 1; j >= 0; j--){
                 if(!isOverlapping(intervals[j], intervals[i])){
                     dp[i] += dp[j];
                     break;
                 }   
            }
            res = Math.max(res, dp[i]);
            
        }
        return intervals.length - res;
    }
}