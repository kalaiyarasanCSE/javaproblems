import java.util.*;
class getSumAbsoluteDifferences{
    public int[] result(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int fin = 0;
            for (int j = 0; j < nums.length; j++) {
                fin =fin+ Math.abs(nums[i] - nums[j]);
            }
            result[i] = fin;
        }
        return result;
    }
    public static void main(String[] arg){
        int nums[]={1,2,34,5,6,7,8};
        getSumAbsoluteDifferences rs=new getSumAbsoluteDifferences();
      System.out.println(Arrays.toString(  rs.result(nums)));
    }
}
