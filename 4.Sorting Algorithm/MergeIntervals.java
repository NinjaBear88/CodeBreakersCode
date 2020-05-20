class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[0] == b[0]) return 0;
                return a[0] < b[0] ? -1 : 1;
            } 
        });
        
        int[][] res = new int[intervals.length][2];
        int j = -1;
        for(int[] interval: intervals){
            if(j == -1 || interval[0] > res[j][1]){
                res[++j] = interval;
            }else{
                res[j][1] = Math.max(res[j][1], interval[1]);
            }
        }
        return Arrays.copyOf(res, j+1);
    }
   