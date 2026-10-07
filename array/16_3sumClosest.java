class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int i=0;
        Arrays.sort(nums);
        int max_diff=Integer.MAX_VALUE;
        int closest=0;
        int diff;
        for(i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    return sum;
                }//if
                else if(sum>target){
                    diff=Math.abs(sum-target);
                    if(max_diff>diff){
                        max_diff=diff;
                        closest=sum;
                    }
                    right--;
                }//else if
                else{
                    diff=Math.abs(sum-target);
                    if(max_diff>diff){
                        max_diff=diff;
                        closest=sum;
                    }
                    left++;
                }//else
            }//while
        }//for loop
        return closest;
    }
}
