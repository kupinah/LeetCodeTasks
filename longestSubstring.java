public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int max = 0;
        int curr = 0;
        HashMap cont = new HashMap();
        int st = 0;
        for(int i = 0; i < len; i++){
            if(cont.containsKey(s.charAt(i))){
                cont = new HashMap();
                st++;
                i = st;
                curr = 0;
            }
            curr++;
            if(max < curr){
                max = curr;
            }
            cont.put(s.charAt(i), i);
        }
        return max;
    }