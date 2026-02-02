class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstind(nums, 0, nums.length - 1, target);
        int last = lastind(nums, 0, nums.length - 1, target);
        int [] res = {first,last};
        return res ;
    }

    static int firstind(int[] nums, int left, int right, int target) {
        int first = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    static int lastind(int[] nums, int left, int right, int target) {
        int last = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }
}
