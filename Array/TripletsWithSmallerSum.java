class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        Arrays.sort(arr);
        int count=0;
        int n=arr.length;
        int i;
        for(i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int add=arr[i]+arr[left]+arr[right];
                
                if(add>=sum){
                    
                    right--;
                }
                else if(add<sum){
                    count=count+(right-left);
                    left++;
                }//else
            }//if
            
        }//for}
        return count;
    }
}
