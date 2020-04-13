class Solution {
    //Stack T:O(N) S:(N)
    public int evalRPN(String[] tokens) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(String token: tokens){
            if(token.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(token.equals("-")){
                stack.push(-stack.pop() + stack.pop());
            }else if(token.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }else if(token.equals("/")){
                int num = stack.pop();
                stack.push(stack.pop()/num);
            }else{
                stack.push(Integer.valueOf(token));
            }          
        }
        
        return stack.pop();
    }
}