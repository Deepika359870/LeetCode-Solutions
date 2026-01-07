class Solution {
    public int minIncrementForUnique(int[] arr) {
      
        Arrays.sort(arr);
        int cnt=0;
        for(int i=1; i< arr.length;i++)
        {
            if(arr[i] <= arr[i -1])
            {
                int inc=arr[i -1]+1-arr[i];
                cnt +=inc;
                arr[i]=arr[i - 1]+1;
            }
        }
        return cnt;
        
    }
}