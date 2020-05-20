import java.util.*;

class Program {
  public static String caesarCypherEncryptor(String str, int key) {
    // Write your code here.
		if(str == null || str.length() == 0){
			return str;
		}
		int len = str.length();
		char[] res = new char[len];
		for(int i = 0; i < len; i++){
			  int endcode = (str.charAt(i) - 'a' + key) % 26 + 'a';
				res[i] = (char) endcode;
		}
		
    return new String(res);
  }
}