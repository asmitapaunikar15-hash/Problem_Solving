class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        ArrayList<List<Integer>> ans = new ArrayList<>();
        int i;
        for(i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            int target=-1*nums[i];
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                right--;
            while(left<n && nums[left]==nums[left-1]){
                left++;
            }
            while(right>=0 && nums[right]==nums[right+1]){right--;}
            }
            else if(sum<target){left++;}
            else{right--;}
        }
        }
        return ans;
    }
}
