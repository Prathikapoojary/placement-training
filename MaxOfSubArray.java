package day2;

public class MaxOfSubArray {
    public static int subSum(int[]nums){
            if(nums.length==1)
                return nums[0];
            else if(nums.length<=1)
                return -1;
            else{
                int cSum = nums[0];
                int msum = nums[0];
                for(int i=1;i<nums.length;i++)
                {
                    cSum=Math.max(nums[i], cSum+nums[i]);
                    msum=Math.max(cSum, msum);
                }
                return msum;

            }

    }
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("the maxOFsubArray:" + subSum(nums));
    }
    
}
