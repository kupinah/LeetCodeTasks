import java.util.*;
public class validParentheses {
    public static void main (String[] args){
        String s = "[][]";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        int counter = 0;
        while(counter < s.length()){
            if(s.charAt(counter) == '(' || s.charAt(counter) == '[' || s.charAt(counter) == '{'){
                st.push(s.charAt(counter));
                counter++;
                continue;
            }
            if(st.isEmpty()) return false;
            char temp = st.pop();
            if(s.charAt(counter) == ')' && (temp == '{' || temp == '[')) return false;
            else if(s.charAt(counter) == ']' && (temp == '{' || temp == '(')) return false;
            else if(s.charAt(counter) == '}' && (temp == '[' || temp == '(')) return false;
            counter++;
        }
        return st.isEmpty();
    }
}
