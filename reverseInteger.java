public class reverseInteger {
    public static void main(String[] args){
        int x = 1234567899;
        System.out.println(reverse(x));
    }

    public static int reverse(int x){
        int temp = 0;
        boolean flag = false;
        if(x < 0){
            x = x*-1;
            flag = true;
        }
        while(x > 0){
            temp = temp * 10 + (x%10);
            if(temp != 0 && Integer.MAX_VALUE/temp < 10 && x > 10) return 0;
            x/=10; 
        }
        if(flag) temp = temp*-1;
        return temp;
    }
}
