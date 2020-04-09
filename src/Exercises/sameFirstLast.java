package Exercises;

public class sameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        if(nums.length > 0) {
            int first = nums[0];
            int last = nums[nums.length - 1];
            if(first == last) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }}
