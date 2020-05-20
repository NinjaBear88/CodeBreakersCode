class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList();
        }
        Map<String, List<String>> res = new HashMap<>();
        
        for(String str: strs){
            int[] counts = new int[26];
            for(char c : str.toCharArray()){
                counts[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int count: counts){
                sb.append(count);
                sb.append('#');
            }
            String key = sb.toString();

            if(!res.containsKey(key)){
                List<String>  list = new ArrayList<>();
                list.add(str);
                res.put(key, list);
            }else{
                res.get(key).add(str);
            }

        }
        return new ArrayList(res.values());
    }
}