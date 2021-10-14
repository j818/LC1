class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        
        int[] res = new int[nums.length];
        int[] left = new int[nums.length];
        left[0] = 1;
        
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        
        int postProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] = postProduct * left[i];
            postProduct *= nums[i];
        }
        return res;
    }
}
