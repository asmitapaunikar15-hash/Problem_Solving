class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int ghar=0;
        int uniq=1;
        int n=nums.length;
        while(i<n){
            if(nums[i]==nums[i-1]){
                i++;
                continue;
            }
            else{
            nums[ghar+1]=nums[i];
            ghar=ghar+1;
            uniq=uniq+1;
            i++;
            }

        }
        return uniq; 
    }
}
