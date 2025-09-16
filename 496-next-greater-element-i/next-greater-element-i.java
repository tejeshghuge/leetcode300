class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] next = new int [10001];
        int[] result = new int [nums1.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = nums2.length - 1; i>=0;i--){
            int num = nums2[i];
            while(!stack.isEmpty() && stack.peek() <= num){
                stack.pop();
            }
            next[num]= stack.isEmpty() ? -1 : stack.peek();
            stack.push(num);
        }
        for(int i= 0; i<nums1.length;i++){
            result[i] = next[nums1[i]];
        }
        return result;
    }
}