package weekonesequences.javacode;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(findTwoSum(nums, target));
    }

    public static String findTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if ((target - nums[i + 1]) == nums[i]) {
                return ("[" + i + "," + (i + 1) + "]");
            }
        }
        return null;
    }
}

/*
Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/
// 9-2  = if 7 present in array copy index of 2 and 7 i. e [0,1]