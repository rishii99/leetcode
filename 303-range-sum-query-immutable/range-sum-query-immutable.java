class NumArray {
    int[] prefixSum; // prefixSum[i] = sum of arr[0:i - 1] off by 1

    public NumArray(int[] nums) {
        prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        // arr[left : right] = arr[0: right] - arr[0: left - 1]
        // = prefixSum[right + 1] - prefixSum[left]
        return prefixSum[right + 1] - prefixSum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */