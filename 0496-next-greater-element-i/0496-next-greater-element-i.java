class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums2.length;
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[10001];
        for (int i = n1 - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums2[i] >= st.peek()) {
                st.pop();
            }
            arr[nums2[i]] = st.isEmpty() ? -1 : st.peek();
            st.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = arr[nums1[i]];
        }
        return nums1;
    }
}