class Solution {

    public void sortColors(int[] nums) {

        int c0 = 0;
        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < nums.length; i = i + 1) {
            if (nums[i] == 0) {
                c0 = c0 + 1;
            } else if (nums[i] == 1) {
                c1 = c1 + 1;
            } else {
                c2 = c2 + 1;
            }
        }

        int index = 0;

        while (c0 > 0) {
            nums[index] = 0;
            index = index + 1;
            c0 = c0 - 1;
        }

        while (c1 > 0) {
            nums[index] = 1;
            index = index + 1;
            c1 = c1 - 1;
        }

        while (c2 > 0) {
            nums[index] = 2;
            index = index + 1;
            c2 = c2 - 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        s.sortColors(nums);

        for (int i = 0; i < nums.length; i = i + 1) {
            System.out.print(nums[i] + " ");
        }
    }
}
