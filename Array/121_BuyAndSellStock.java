class Solution {
    public int maxProfit(int[] prices) {
        int buy=0;
        int sell=0;
        int max=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];}
            sell=prices[i]-min;
            if(sell>max){
                max=sell;
            }}
        if(max<0||max==0){return 0;}
        else{return max;}
    }}
