class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = maxm(piles);
        return hour(1, max, h, piles);
    }

    static int maxm(int[] piles) {
        int max = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        return max;
    }

    static int hour(int left, int right, int h, int[] piles) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            int time = 0;

            for (int i = 0; i < piles.length; i++) {
                time += (piles[i] + mid - 1) / mid;
            }

            if (time <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
