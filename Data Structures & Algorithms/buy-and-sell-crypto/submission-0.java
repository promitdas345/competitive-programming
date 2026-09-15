class Solution {
    // Track the cheapest price seen so far and the best profit against it.
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int best = 0;

        for (int p : prices) {
            if (p < min) min = p;
            else best = Math.max(best, p - min);
        }
        return best;
    }
}
