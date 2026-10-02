class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int sr[]=new int[n];
        for(int i=0;i<n;i++){
            sr[i]=nums[i]*nums[i];
        }
        Arrays.sort(sr);
        return sr;
    }
}
