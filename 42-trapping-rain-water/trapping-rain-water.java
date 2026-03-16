class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int res = 0;
        left[0] = height[0]; // find left maximum 
        for(int i = 1; i < n; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }
        right[n-1] = height[n-1]; //find right maximum 
        for(int i = n-2; i >= 0; i--){
            right[i] = Math.max(right[i+1], height[i]);
        }
        for(int i = 1; i < n-1; i++){ // calculate water at each index 
            int minOf2 = Math.min(left[i], right[i]);
            res += minOf2 - height[i];
        }
        return res;
    }
    public static void main(String[] args) { // Main function 
        int[] arr = {4,2,0,3,2,5};
        Solution obj = new Solution();
        System.out.println(obj.trap(arr));
    }
}


 //water[i] = min(leftMax, rightMax) - height[i] ---formula

