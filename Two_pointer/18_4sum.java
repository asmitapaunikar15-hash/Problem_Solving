class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int i;
        int j;
        for(i=0;i<n-3;i++){
            if (i>0 && nums[i]==nums[i-1]){
                continue;}
            for(j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;}
            int left=j+1;
            int right=n-1;
            while(left<right){
                long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                if(sum>target){
                    right--;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]){left++;}
                    while(right>=2 && nums[right]==nums[right+1]){right--;}
                }
        }
    }}
    return(ans);
}}
