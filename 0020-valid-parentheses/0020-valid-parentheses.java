import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        if(s.length()==1)
            return false;
        for(int i=0;i<s.length();i++)
        {
            switch(s.charAt(i))
            {
                case '(':
                        stack.push('(');
                        break;
                case '{':
                        stack.push('{');
                        break;
                case '[':
                        stack.push('[');
                        break;
                case ')':
                        if(stack.empty())
                            return false;
                        else if(stack.peek()!='('){
                            return false;
                        }
                        else
                            stack.pop();
                        break;
                case '}':
                        if(stack.empty())
                            return false;
                        else if(stack.peek()!='{'){
                            return false;
                        }
                        else
                            stack.pop();
                        break;
                case ']':
                        if(stack.empty())
                            return false;
                        else if(stack.peek()!='['){
                            return false;
                        }
                        else
                            stack.pop();
                        break;
            }
        }
        if(stack.empty())
            return true;
        else
            return false;
        
    }
}