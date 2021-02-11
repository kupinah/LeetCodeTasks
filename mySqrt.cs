class mysqrt{
    public int MySqrt(int x) {
        if(x==0) return 0;
        if(x==1) return 1;
        int c = 2;
        while(c < 46340 && c <= x/2){
            if(c*c > x) {
                if((c-1)*(c-1) > x) return c-2;
                return c-1;
            }
            if(c*c == x) return c;
            c+=2;
        }
        if(c==46340) {
            if(c*c > x) return c-1;
            return c;
        }
        if((c-1)*(c-1) > x) return c-2;
        return c-1;
    }
}