class strStr {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        for(int i = 0; i < haystack.length(); i++){
            int tmp=i;
            if(haystack.charAt(i) == needle.charAt(0)){
                for(int j = 0; j < needle.length(); j++){
                    if(tmp >= haystack.length()) return -1;
                    if(haystack.charAt(tmp) != needle.charAt(j)) break;
                    if(j == needle.length()-1 && (haystack.charAt(tmp) == needle.charAt(j))) return tmp - needle.length()+1;
                    tmp++;
                }
            }
        }
        return -1;
    }
}