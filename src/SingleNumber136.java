// Given an array of integers, every element appears twice except for one. Find that single one.
//
//        Note:
//        Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?


public class SingleNumber136 {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            answer ^= nums[i];
        }
        return answer;
    }
}
