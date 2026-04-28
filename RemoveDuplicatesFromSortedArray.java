import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};

        int k = removeDuplicates(nums);

        System.out.println(k);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
