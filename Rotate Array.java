class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    void reverse(int[]a,int st,int end){
        while(st<end){
            int t=a[st];
            a[st]=a[end];
            a[end]=t;
            st ++;
            end --;


        }

    }
}