public class longestCommonPrefix {
    public static void main(String[] args){
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longest(strs));
    }

    public static String longest(String[] strs){
        int countC = 0;
        String res = "";
        boolean flag = false;
        if(strs.length == 0) return "";
        while(countC < strs[0].length()){
            for(int i = 1; i < strs.length; i++){
                if(countC >= strs[i].length() || !((strs[0].charAt(countC)) == (strs[i].charAt(countC)))){
                    flag = true;
                    break;
                } 
            }
            if(!flag) res+=strs[0].charAt(countC);
            countC++;
        }
        return res;
    }
}
