import java.util.Arrays;

class leetcodeaddsum{
    public int[] runningSum(int[] nums) {
        int length=nums.length;
        int result[]=new int[length] ;
        int add=0;
        for (int i=0; i<nums.length; i++){
        add=add+nums[i];
        result[i]=add;


        }
        return result;
        
    }
    public static void main(String[] arg){
        int nums[]={2,3,4,5,6};
        leetcodeaddsum sum=new leetcodeaddsum();
      
        System.out.println( Arrays.toString( sum.runningSum(nums)));


    }
}