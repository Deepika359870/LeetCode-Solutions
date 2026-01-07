class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length, time = 0;

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++)  
            q.offer(i);

        while (tickets[k] > 0) {
            int i = q.poll();  
            time++;
            tickets[i]--;      
            if (tickets[i] > 0)
                q.offer(i);     
        }
        return time;
    }
}