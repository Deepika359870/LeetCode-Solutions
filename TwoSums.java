class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int i,j;
        for(i=0;i<nums.length;i++){
            for(j=0;j<nums.length;j++)
            {
                if( i== j){
                    continue;
                }
                if(nums[i]+ nums [j]== target){
                    return new int[]{i,j};

                }


            }
        }
        return new int[0];
    }
}