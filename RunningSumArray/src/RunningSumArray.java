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

        //The outer for loop will control current position in the array
        //while the inner for loops adds the values coming up to the current position 
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i; j >= 0; j--)
            {
                sumArray[i] += nums[j];
            }
        }

        return sumArray;
    }

}
