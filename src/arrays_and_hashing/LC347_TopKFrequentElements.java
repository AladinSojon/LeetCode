// LC 347. Top K Frequent Elements
// https://leetcode.com/problems/top-k-frequent-elements/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        map = map.entrySet().stream().sorted((a, b) -> b.getValue() - a.getValue()).collect(
                Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, () -> new LinkedHashMap<>()));

        int i = 0;

        int[] arr = new int[k];

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            arr[i] = e.getKey();

            i++;

            if (i == k)
                break;
            ;
        }

        return arr;
    }
}
