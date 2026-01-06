class Solution {
    public int removeElement(int[] nums, int val) {
       int i=0;
       for(int a:nums){
        if(a!=val)
        nums[i++]=a;
        

       }
       return i;

    }
}

