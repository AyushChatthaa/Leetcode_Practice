class Solution {
    public int maxProfit(int[] prices) {
        int maxi=0;
        int lowest=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<lowest){
                lowest=prices[i];
                continue;
            }
            int diff=prices[i]-lowest;
            maxi=Math.max(maxi,diff);
        }
        return maxi;
    }
}