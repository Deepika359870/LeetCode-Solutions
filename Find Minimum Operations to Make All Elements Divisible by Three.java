class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int a:nums){
            if(a%3 !=0)
            c++;
        }
        return c;
        
        
        
    }
}