class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     int maxPile = 0;
        for (int p : piles) {
            maxPile = Math.max(maxPile, p);
        }
        int low = 1, high = maxPile;
        int answer = maxPile;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long hours = 0;

            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {
                answer = mid;
                high = mid - 1;   
            } else {
                low = mid + 1;   
            }
        }

        return answer;
    }
}