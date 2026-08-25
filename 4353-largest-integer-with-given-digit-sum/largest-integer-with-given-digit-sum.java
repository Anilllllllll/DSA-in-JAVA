class Solution {
    public int largestInteger(int n, int s) {

        if (s == 0) {
            return 0;
        }

        int ans = -1;

        int start = 1;
        for (int i = 1; i < n; i++) {
            start *= 10;
        }

        int end = start * 10 - 1;

        for (int i = start; i <= end; i++) {

            int sum = 0;
            int m = i;

            while (m != 0) {
                sum += m % 10;
                m /= 10;
            }

            if (sum == s) {
                ans = i;
            }
        }

        return ans;
    }
}