import java.util.*;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        // Store all valid triplets
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array for binary search
        Arrays.sort(nums);

        int n = nums.length;

        // Select the first number
        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate first numbers
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Select the second number
            for (int j = i + 1; j < n - 1; j++) {

                // Skip duplicate second numbers
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                // Calculate the required third number
                int target = -(nums[i] + nums[j]);

                // Search only after the second number
                int left = j + 1;
                int right = n - 1;

                // Apply binary search
                while (left <= right) {

                    int mid = left + (right - left) / 2;

                    // Target found
                    if (nums[mid] == target) {

                        result.add(Arrays.asList(
                            nums[i], nums[j], nums[mid]
                        ));

                        break;
                    }

                    // Target is on the right
                    else if (nums[mid] < target) {
                        left = mid + 1;
                    }

                    // Target is on the left
                    else {
                        right = mid - 1;
                    }
                }
            }
        }

        return result;
    }
}