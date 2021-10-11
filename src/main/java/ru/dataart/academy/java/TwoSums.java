package ru.dataart.academy.java;

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
        int first = 0;
        int second = 0;
        boolean numsExist = false;

        label:
        for (int i = 0; i < nums.length; i++) {
            first = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                second = nums[j];
                if (first + second == target) {
                    numsExist = true;
                    break label;
                }
            }
        }
        if (numsExist) {
            return new int[]{first, second};
        } else {
            return new int[]{};
        }
    }
}
