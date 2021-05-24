package GroupSize.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * There are n people that are split into some unknown number of groups. Each person is labeled with a unique ID from 0 to n - 1.
 * You are given an integer array groupSizes, where groupSizes[i] is the size of the group that person i is in. For example, if groupSizes[1] = 3, then person 1 must be in a group of size 3.
 * Return a list of groups such that each person i is in a group of size groupSizes[i].
 * Each person should appear in exactly one group, and every person must be in a group. If there are multiple answers, return any of them. It is guaranteed that there will be at least one valid solution for the given input.
 * 
 * Constraints:
 * groupSizes.length == n
 * 1 <= n <= 500
 * 1 <= groupSizes[i] <= n
 * 
 * Example:
 * Input: groupSizes = [2,1,3,3,3,2]
 * Output: [[1],[0,5],[2,3,4]]
 * The numbers in the output represent the unique ID aka their index
*/
public class GroupSize {
    public static void main(String[] args)
    {

    }

    public List<List<Integer>> groupThePeople(int[] groupSizes) 
    {
        List<List<Integer>> accumulatingLists = new ArrayList<List<Integer>>();
        for (int i = 0; i < groupSizes.length; i++)
        {
            List<Integer> toAdd = new ArrayList<Integer>();
            toAdd.add(groupSizes[i]);
            int count = 0;
            for (int j = i+1; j < groupSizes.length || groupSizes[i] > count; j++)
            {
                count++;
                if (groupSizes[i] == groupSizes[j])
                {
                    toAdd.add(groupSizes[j]);
                }
            }
            accumulatingLists.add(toAdd);
        }
        return accumulatingLists;
    }
}
