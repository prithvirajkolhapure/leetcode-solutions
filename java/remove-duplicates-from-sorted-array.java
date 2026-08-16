
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        ArrayList<Integer> uniqueList = new ArrayList<>();
        // Collect unique elements from the sorted array.
        for (int num : nums) {
            if (uniqueList.isEmpty() || uniqueList.get(uniqueList.size() - 1) != num) {
                uniqueList.add(num);
            }
        }
        // Overwrite the original array with unique elements.
        for (int i = 0; i < uniqueList.size(); i++) {
            nums[i] = uniqueList.get(i);
        }
        return uniqueList.size();
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        int k = removeDuplicates(nums);
        System.out.println("New length: " + k); // Expected output: 3
        System.out.println("Array after removal: " + Arrays.toString(Arrays.copyOf(nums, k))); // Expected: [1, 2, 3]
    }
}

