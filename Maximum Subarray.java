class Solution {
    public int maxSubArray(int[] nums) {
      int mx=Integer.MIN_VALUE;
      int s=0;
      for(int n:nums){
        s=s+n;
        mx=Math.max(mx,s);
        if(s<0)
        s=0;

      } 
      return mx;

    }
}