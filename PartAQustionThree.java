/*
3. Calculate the Probability of all Possible Sums occurring among the number of
combinations from (2).
Example: P(Sum = 2) = 1/X as there is only one combination possible to obtain
Sum = 2. Die A = Die B = 1.

 */

import java.util.HashMap;
import java.util.Map;

public class PartAQustionThree {
    public HashMap<Integer,Integer> probabilityOfAllPossibleSum(int[][] dice,int total)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] row : dice) {
            for (int num : row) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return  map;
    }
}
