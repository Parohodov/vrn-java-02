package ru.dataart.academy.java;

import java.util.Arrays;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        // Task implementation

        if (nums.length == 0) {
            return new int[]{};
        }

        if (nums[0] > target) {
            return new int[]{};
        }

        int first;
        int second;
        boolean numsExist = false;
        int maxValue = nums[nums.length-1];

        for (int i = 0; i < nums.length; i++) {
            first = nums[i];

            // There is no point to check if a current number meets the condition with any number from an array
            // if it doesn't with a maximum value (because array is sorted)
            // That's how all numbers that can't have a pair in the array are skipped
            if (first < target - maxValue) {
                continue;
            }

            // Checking all remained sub arrays
            for (int j = i + 1; j < nums.length; j++) {
                second = nums[j];
                if (first + second == target) { // Condition
                    return new int[]{first, second};
                }
            }

            // In case of multiple choices
            // If (prevNumber + maxValue == target) than (currNumber + maxValue > target) for sure
//            maxValue = nums[length-1];
        }

        return new int[]{};
    }
}
