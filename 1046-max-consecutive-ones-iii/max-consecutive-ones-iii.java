class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int window = 0;
        int n = nums.length;
        int left =0;

        for(int right = 0; right <n;right++){
            window = window + nums[right];
            while(window + k < right - left + 1 ){
                window = window -nums[left];
                left++;
            }
            ans = Math.max(ans , right -left +1);

        }
        return ans;
    }
}