import java.util.HashSet;
import java.util.Set;

class Solution {
    // Only start counting at a number with no left neighbour, so each run is walked once.
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int best = 0;
        for (int n : set) {
            if (set.contains(n - 1)) continue;

            int len = 1;
            while (set.contains(n + len)) len++;
            best = Math.max(best, len);
        }
        return best;
    }
}
