import java.util.*;
public class palindromeNumber {
    public static void main(String[] args){
        int x = 1;
        System.out.println(palindrome(x));
    }
    public static boolean palindrome(int x){
        if(x < 0) return false;
        Stack<Integer> s = new Stack<>();
        int tmp = x;
        while(tmp > 0){
            s.push(tmp%10);
            tmp/=10;
        }
        while(x > 0 && !s.isEmpty()){
            if(x%10 != s.pop()) return false;
            x/=10;
        }
        return true;
    }
}
