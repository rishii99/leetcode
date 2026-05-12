class Solution {
    public int nextGreaterElement(int n) {
        char[] arr = String.valueOf(n).toCharArray();

        int i = arr.length - 2;

        // Step 1: Find first decreasing digit from right
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // If no such digit exists
        if (i < 0) {
            return -1;
        }

        // Step 2: Find just greater digit on right side
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        // Step 3: Swap
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // Step 4: Reverse remaining part
        reverse(arr, i + 1, arr.length - 1);

        // Convert back to number
        long ans = Long.parseLong(new String(arr));

        // Check 32-bit integer limit
        return (ans > Integer.MAX_VALUE) ? -1 : (int) ans;
    }

    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}