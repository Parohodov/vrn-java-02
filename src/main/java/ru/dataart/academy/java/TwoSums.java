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

        int first = 0;
        int second = 0;
        boolean numsExist = false;
        int maxValue = nums[nums.length-1];

        label:
        for (int i = 0; i < nums.length; i++) {
            first = nums[i];

            // There is no point to check if a current number meets the condition with any number from an array
            // if it doesn't with a maximum value (because array is sorted)
            if (first < target - maxValue) {
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {
                second = nums[j];
                if (first + second == target) {
                    numsExist = true;
                    break label;
                }
            }

            // In case of multiple choices
            // If (prevNumber + maxValue == target) than (currNumber + maxValue > target) for sure
//            maxValue = nums[length-1];
        }

        if (numsExist) {
            return new int[]{first, second};
        } else {
            return new int[]{};
        }
    }
}
