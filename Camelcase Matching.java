class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
         List<Boolean>res= new ArrayList<>();
        for(String q: queries)
        {
            int i =0;
            int j=0;
            boolean ans=true;
            while(i < q.length()){
                char qc=q.charAt(i);
             if(j < pattern.length() && qc==pattern.charAt(j))
             {
                i++;
                j++;
             }
             else if(Character.isLowerCase(qc))
             i++;
             else
             {
                ans=false;
                break;
             }
            }
        if(j<pattern.length())
        ans=false;
        res.add(ans);
        }
       return res;
    }
}