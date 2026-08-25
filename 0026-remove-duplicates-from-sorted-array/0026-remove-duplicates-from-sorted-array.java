class Solution {
    public int removeDuplicates(int[] nums) {
        // Handle edge case for empty array
        if (nums.length == 0) {
            return 0;
        }
        
        // Pointer i keeps track of the index of the last unique element found
        int i = 0; 
        
        // Pointer j iterates through the array to find new unique elements
        for (int j = 1; j < nums.length; j++) {
            // When a new unique element is encountered
            if (nums[j] != nums[i]) {
                i++; // Move the unique pointer forward
                nums[i] = nums[j]; // Update the position with the new unique value
            }
        }
        
        // Since i is a 0-based index, the total count of unique elements is i + 1
        return i + 1; 
    }
}