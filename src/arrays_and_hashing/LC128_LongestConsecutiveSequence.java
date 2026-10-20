// LC 128. Longest Consecutive Sequence
// https://leetcode.com/problems/longest-consecutive-sequence/

import java.util.HashSet;
import java.util.Set;

class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int n : nums) {
            numSet.add(n);
        }

        int max = 0;

        for (int n : nums) {
            if (!numSet.contains(n - 1)) {
                int cnt = 1;

                while (numSet.contains(n + 1)) {
                    cnt++;
                    n = n + 1;
                }

                max = Math.max(cnt, max);
            }
        }

        return max;
    }
}
