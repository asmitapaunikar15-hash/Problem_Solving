class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        for(int i=0;i<accounts.length;i++){
             int nsum=0;
            for(int j=0;j<accounts[0].length;j++){
                nsum+=accounts[i][j];
            }
             if(sum<nsum){
                    sum=nsum;
                }
        }
        return sum;
    }
}
