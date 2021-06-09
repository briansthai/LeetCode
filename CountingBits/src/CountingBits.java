package CountingBits.src;

/*
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
 * 
 * Example: 
 * Input: n = 2
 * Output: [0,1,1]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
*/
public class CountingBits {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        //Need to find a pattern of numbers of 1's in binary
        
        //0 -> 0 -> 0
        //1 -> 1 -> 1

        //2 -> 10 -> 1
        //3 -> 11 -> 2

        //4 -> 100 -> 1
        //5 -> 101 -> 2
        //6 -> 110 -> 2
        //7 -> 111 -> 3

        //8 -> 1000 -> 1
        //9 -> 1001 -> 2
        //10 -> 1010 -> 2
        //11 -> 1011 -> 3
        //12 -> 1100 -> 2
        //13 -> 1101 -> 3
        //14 -> 1110 -> 3
        //15 -> 1111 -> 4
        
        ans[0] = 0;
        for (int i = 1; i<=n; i++)
        {
            if (i%2 == 0)
            {
                ans[i] = ans[i/2];
            }
            else
            {
                ans[i] = ans[i-1]+1;
            }
        }

        return ans;
    }
}
