class Solution {
    public boolean judgeSquareSum(int c) {
        int i=0;
        int j = (int)Math.sqrt(c);
        while(i<=j){
            long s1=i*i;
            long s2=j*j;
            if(s1+s2<c){
                i++;
            }
            else if(s1+s2>c){
                j--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
