class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        // initialize all results with -1
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        // loop twice for circular array
        for (int i = 2 * n - 1; i >= 0; i--) {
            int num = nums[i % n];
            
            // maintain decreasing stack
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }

            if (i < n) { // fill result only in first pass
                result[i] = stack.isEmpty() ? -1 : stack.peek();
            }

            stack.push(num);
        }

        return result;
    }
}
