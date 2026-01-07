class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length, c=0,elt=nums[0];
        for(int a: nums) {
            if(c==0){
            c=1;
            elt=a;
            }
          else if (a == elt)
            c++;
            
            else
                c--;
        }
          c=0;
        for(int a:nums)
            if( a == elt )
                c++;
        if(c > n/2)
            return elt;
        else
            return -1;
            
    }

}