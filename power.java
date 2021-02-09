public double myPow(double x, int n) {
        if(n==0 || x==1) return 1;
        if(x==-1 && n%2 == 0) return 1.0;
        if(x==-1 && n%2 == 1) return -1.0;
        if(n < Integer.MIN_VALUE/2 || n > Integer.MAX_VALUE/2) return 0.0;
        
        double p = x;
        boolean flag = false;
        if(n < 0){
            n = n * (-1);
            flag = true;
        }
        while(n > 1){
            x*=p;
            n--;
        }
        return flag ? 1/x : x;
    }