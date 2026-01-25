class Solution {
    public int removeElement(int[] nums, int val) {
        int n=0;
        for(int i=0; i<nums.length; i++){
            if (val!=nums[i]){
                nums[n]=nums[i];
                n++;
                

            }

        }return n;
        
    }
}
