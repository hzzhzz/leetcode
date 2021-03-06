// Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
//
//        Do not allocate extra space for another array, you must do this in place with constant memory.
//
//        For example,
//        Given input array nums = [1,1,2],
//
//        Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.


import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArray26 {
    public int solution(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i == 0 || n != nums[i - 1]) {
                nums[i++] = n;
            }
        }
        return i;
    }
}
