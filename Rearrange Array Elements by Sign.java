class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length, even=0, odd=1;
        int [] res=new int[n];
        for(int a:nums){
          if( a>=0 ){
          res[even]=a;
            even +=2;
          }else{
            res[odd]=a;
            odd += 2;
          }
        }
        return res;

    }
}