class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
     
       int s= n*(n+1)/2;
        int s1=0;
        for(int a:nums){
            s1+=a;
        }
        return s-s1;

    }
}