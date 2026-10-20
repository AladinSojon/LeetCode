import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> duplicates = new HashSet<>();

        for (int n : nums) {
            if (duplicates.contains(n))
                return true;

            duplicates.add(n);
        }

        return false;
    }
}
