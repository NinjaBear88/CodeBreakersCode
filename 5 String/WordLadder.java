class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level = 0;
        while( queue.size() > 0){
            int size = queue.size();
            level++;
            for(int i = 0; i < size; i++){
                char[] cur = queue.poll().toCharArray();
                for(int j = 0; j < cur.length; j++){
                    char temp = cur[j];
                    for(char c = 'a'; c <= 'z'; c++){
                        cur[j] = c;
                        String s = new String(cur);
                        if(set.contains(s)){
                            if(s.equals(endWord)){
                                return level + 1;
                            }
                            queue.add(s);
                            set.remove(s);
                        }
                    }
                    cur[j] = temp;
                }
            }
        }
        return 0;
    }

}