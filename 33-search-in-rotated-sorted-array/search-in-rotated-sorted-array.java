class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivotIndex = pivot(0, n - 1, nums);

        int leftResult = binarySearch(0, pivotIndex - 1, nums, target);
        if (leftResult != -1) return leftResult;

        return binarySearch(pivotIndex, n - 1, nums, target);
    }

    static int pivot(int left, int right, int[] nums) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    static int binarySearch(int left, int right, int[] nums, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;
            if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}
