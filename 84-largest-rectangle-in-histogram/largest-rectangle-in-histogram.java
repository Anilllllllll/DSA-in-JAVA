class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        int[] nsl = new int[n];
        int[] nsr = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            int val = heights[i];
            while (!st.isEmpty() && heights[st.peek()] >= val) {
                st.pop();
            }
            nsl[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        for (int i = n - 1; i >= 0; i--) {
            int val = heights[i];
            while (!st.isEmpty() && heights[st.peek()] >= val) {
                st.pop();
            }
            nsr[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int area = heights[i] * width;
            max = Math.max(max, area);
        }

        return max;
    }
}
