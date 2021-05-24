package RunningSumArray.src;

/*
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 * 
 * Constraints:
 * 1 <= nums.length <= 1000
 * -10^6 <= nums[i] <= 10^6
 * 
 * Example:
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*/
public class RunningSumArray {
    public static void main(String[] args) throws Exception {
        int[] arrayToSum = {1,2,3,4};
        for (int x : runningSum(arrayToSum))
        {
            System.out.println(x);
        }
    }
    
    public static int[] runningSum(int[] nums)
    {
        int[] sumArray = new int[nums.length];
        sumArray[0] = nums[0];

        //Add the running sum (which is being tracked by sumArray) with the current nums value
        for (int i = 1; i < nums.length; i++)
        {
            sumArray[i] = nums[i] + sumArray[i-1];
        }

        return sumArray;
    }

}
