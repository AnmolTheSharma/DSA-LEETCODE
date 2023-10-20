class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1}; // Initialize an array of two elements
        result[0] = ffirst(nums, target);
        result[1] = llast(nums, target);
        return result;
    }

    private int ffirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int first = -1; // Initialize to -1, indicating not found
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

    private int llast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int last = -1; // Initialize to -1, indicating not found
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
