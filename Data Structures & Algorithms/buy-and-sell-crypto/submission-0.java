class Solution {
    public int maxProfit(int[] prices) {
        int a=0,min=prices[0];
        for(int x:prices){
            a=Math.max(a,x-min);
            min=Math.min(x,min);
        }return a;

    }
}
