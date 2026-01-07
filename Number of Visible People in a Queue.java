class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        Stack<Integer>st=new Stack<>();
        int [] res=new int[n];
        st.push(heights[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            int c=0;
            while(!st.isEmpty() && heights[i]>st.peek())
           {
                c++;
                st.pop();
            }
            if(!st.isEmpty())
            c++;
            res[i]=c;
            st.push(heights[i]);
        }
        return res;

    }
}