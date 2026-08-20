class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            // Place the x element
            result[2 * i] = nums[i];
            // Place the y element
            result[2 * i + 1] = nums[i + n];
        }
        
        return result;
    }
}