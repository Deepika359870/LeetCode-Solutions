class Solution {
    public int searchInsert(int[] nums, int target) {
     int low=0,high=nums.length-1,mid;
            
        if(target>nums[high])   return high+1;
        if(target<nums[low])    return 0;
        //BS
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(target>nums[mid]){
                low=mid+1;
            }
            else if(target<nums[mid]){
                high=mid-1;
            }
            else{
                return mid;
            }
        }
        return low;   
    }
} 

