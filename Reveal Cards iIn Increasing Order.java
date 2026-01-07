class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] res = new int[n];
        Queue<Integer> q = new LinkedList<>();
        Arrays.sort(deck); 
        for (int i = 0; i < n; i++)
            q.offer(i); 
        
        for (int a : deck) {
            int idx = q.poll(); 
            res[idx] = a;    
            if (!q.isEmpty())
                q.offer(q.poll()); 
        }
        return res;
    }
}