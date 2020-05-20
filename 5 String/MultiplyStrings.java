class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int len1 = num1.length();
        int len2 = num2.length();
        int[] res = new int[len1 + len2];
        for(int i = len1 - 1; i >= 0; i--){
            int n1 = num1.charAt(i) - '0';
            for(int j = len2 - 1; j >= 0; j--){
                int n2 = num2.charAt(j) - '0';
                int temp = n1 * n2 + res[i + j + 1];

                res[i + j + 1] = temp % 10;
                res[i + j] += temp /10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < res.length; i++){
            if(i == 0 && res[i] == 0){
                continue;
            }
            sb.append(res[i]);
        }
        return sb.toString();
    }

}