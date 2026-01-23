public class containsNearbyDuplicate{

    public boolean solution (int[] nums, int k) {

     
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {

                    if (Math.abs(i - j) <= k) {
                        return true;
                    }
                }
            }
        }

        return false;
    }


    public static void main(String[] args) {

       containsNearbyDuplicate sol = new containsNearbyDuplicate();

    
        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        System.out.println(sol.solution(nums2, k2)); 
     
    }
}
