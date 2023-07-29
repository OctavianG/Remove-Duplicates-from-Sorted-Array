public class Main {

    // Input: nums = [0,0,1,1,1,2,2,3,3,4]
    // Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    // Explanation: Your function should return k = 5, with the first five elements of nums
    // being 0, 1, 2, 3, and 4 respectively.
    // It does not matter what you leave beyond the returned k (hence they are underscores).
    public static int removeDuplicates(int[] nums) {
        int k = 1;

        // we check if the current number is different from the previous
        // if the number is different we store it at index k and increment k by 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(nums));
    }
}