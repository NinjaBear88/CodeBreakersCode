import java.util.*;

class Program {
  public static String longestSubstringWithoutDuplication(String str) {
    char[] array = str.toCharArray();
		int left = 0;
		int right = 0;
		int maxL = 0;
		int maxR = 0;
		int maxLen = 0;
		Set<Character> distinct = new HashSet<>();
		
		while(right < array.length){
			if(!distinct.contains(array[right])){
				distinct.add(array[right]);
				right++;
				if(right - left > maxLen){
					maxLen = right - left;
					maxL = left;
					maxR = right;
				}
			}else{
				distinct.remove(array[left]);
				left++;
			}
		}
    return str.substring(maxL, maxR);
  }
}