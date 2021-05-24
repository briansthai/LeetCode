package GroupSize.src;

import java.util.ArrayList;
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
        int[] testInput = {3,3,3,3,3,1,3};
        System.out.println(groupThePeople(testInput));
    }

    public static List<List<Integer>> groupThePeople(int[] groupSizes) 
    {
        List<List<Integer>> finalGroups = new ArrayList<List<Integer>>();

        //Convert Array to ArrayList for easy manipulation of elements
        //Arrays are difficult to resize
        List<Integer> list_groupSizes= new ArrayList<Integer>();
        List<Integer> list_uniqueID = new ArrayList<Integer>();
        for(int i = 0; i < groupSizes.length; i++)
        {
            list_groupSizes.add(groupSizes[i]);
            list_uniqueID.add(i);
        }

        
        while (list_groupSizes.size() != 0)
        {   
            //Create the first group and place one element inside (in this case we use the first element)
            List<Integer> group = new ArrayList<Integer>();
            int currGroupSize = list_groupSizes.get(0);
            group.add(list_uniqueID.get(0));
            list_groupSizes.remove(0);
            list_uniqueID.remove(0);

            
            int counter = 0;
            /*
             * NOTE: This while loop does not need to check if there any "remainder" individuals who cant fulfill their group size due to lack of individuals
             * because the prompt states "It is guaranteed that there will be at least one valid solution for the given input."
            */
            while (group.size() != currGroupSize)
            {
                if (list_groupSizes.get(counter) == currGroupSize)
                {
                    group.add(list_uniqueID.get(counter));
                    list_groupSizes.remove(counter);
                    list_uniqueID.remove(counter);
                    //Do not want to change the counter if we removed an element from the list because the indicies in the list has been shifted down
                    counter--;
                }
                counter++;
            }
            finalGroups.add(group);
        }
        
        return finalGroups;

    }
}
