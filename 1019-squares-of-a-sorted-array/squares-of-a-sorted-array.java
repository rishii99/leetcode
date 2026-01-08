class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int n = nums.length;
        int right = n - 1;
        int[] result = new int[nums.length]; 
        for (int pos = n-1; pos >= 0; pos--) {
            int leftSqr = nums[left] * nums[left];
            int rightSqr = nums[right] * nums[right];
            if (leftSqr > rightSqr) {
                result[pos] = leftSqr;
                left++;
            } else {
                result[pos] = rightSqr;
                right--;
            }
        }
        return result; 
    }
}