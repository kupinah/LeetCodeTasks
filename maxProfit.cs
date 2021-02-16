class maxprofit{
    public int MaxProfit(int[] prices) {
        int min = prices[0];
        int maxDiff = 0;
        foreach(int i in prices){
            if(i < min) min = i;
            if(i-min > maxDiff) maxDiff = i-min;
        }
        return maxDiff;
    }
}