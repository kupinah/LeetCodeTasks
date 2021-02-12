class climbingstairs{
    public int ClimbStairs(int n) {
        int[] memo = new int[n+1];
        return ClimbStairs(n, memo);
    }
    public int ClimbStairs(int n, int[] memo){
        if(memo[n] != 0) return memo[n];
        if(n <= 1) return 1;
        memo[n] = ClimbStairs(n-1, memo) + ClimbStairs(n-2, memo);
        return memo[n];
    }
}