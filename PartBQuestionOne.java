import java.util.HashMap;
import java.util.Map;

public class PartBQuestionOne {
    public int[] doomedDice(int[] diceA,int[] diceB)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num1 : diceA)
        {
            for(int num2 : diceB)
            {
                int sum = num1 + num2;
                map.put(sum, map.getOrDefault(sum, 0)+1);
            }
        }   

        // for(Map.Entry<Integer,Integer> entry : map.entrySet())
        // {
        //     System.out.println(entry.getKey()+" "+entry.getValue());
        // }

        HashMap<Integer,Integer> difference = new HashMap<>();
        for(int sum : map.keySet())
        {
            int diff = map.get(sum) - countOccurences(diceB,sum);
            difference.put(sum,diff);
        }

        // for(Map.Entry<Integer,Integer> entry : difference.entrySet())
        // {
        //     System.out.println(entry.getKey()+" "+entry.getValue());
        // }

        int maxPossibleSize = diceA.length * 4;
        int[] newDiceA = new int[maxPossibleSize];
        int index = 0;
        for(int val : diceA)
        {
            int spot = 0;
            for(int sum : difference.keySet())
            {
                if(sum <= 4)
                    spot +=difference.get(sum);
            }

            int spotsToAdd = Math.min(4 - val, spot);
            for(int i=0;i<spotsToAdd;i++)
                newDiceA[index++] = val;
        }

        int[] array = new int[index];
        for(int i=0;i<index;i++)
            array[i] = newDiceA[i];

        return array;

    }
    public static int countOccurences(int[] array,int target)
        {
            int count = 0;
            for(int num : array)
            {
                if(num == target)
                    count++;
            }
            return count;
        }
}
