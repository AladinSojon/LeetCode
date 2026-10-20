// LC 238. Product of Array Except Self
// https://leetcode.com/problems/product-of-array-except-self/

class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int product = 1;
        result[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            result[i] = nums[i - 1] * product;

            product = result[i];
        }

        product = 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            result[i] = result[i] * product * nums[i + 1];

            product = product * nums[i + 1];
        }

        return result;
    }
}
