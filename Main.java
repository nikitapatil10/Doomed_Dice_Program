import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String args[])
    {
        int diceA[] = {1,2,3,4,5,6};
        int diceB[] = {1,2,3,4,5,6};
        
        //Part A Program 1 call
        PartAQuestionOne one = new PartAQuestionOne();
        int totalComb = one.totalCombinations(diceA, diceB);
        System.out.println("Total combinations of the two dice are : "+totalComb);
        System.out.println();

        //Part B Program 2 call
        
        System.out.println("All Possible combinations : ");
        PartAQuestionTwo two = new PartAQuestionTwo();
        int[][] diceSum = two.sumOfAllPossibleCombinations(diceA, diceB);
        System.out.println();
        System.out.println("Sum Of all above combinations ");
        for(int[] row : diceSum)
        {
            for(int num : row)
                System.out.print(num + " ");

            System.out.println();
        }

        //Part A Program 3 call
        System.out.println();
        System.out.println("Probability for all possible sum is : ");
        PartAQustionThree three = new PartAQustionThree();
        HashMap<Integer,Integer> map = three.probabilityOfAllPossibleSum(diceSum, totalComb);
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.printf("P(Sum = %d) = %d/36\n",entry.getKey(),entry.getValue());
        }

        //Part B Program call
        System.out.println();
        System.err.println("The new dice generaion is : ");
        PartBQuestionOne bone = new PartBQuestionOne();
        int[] newDiceA = bone.doomedDice(diceA, diceB);

        System.out.print("New Dice A: ");
        for (int i : newDiceA) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("New Dice B: ");
        for (int i : diceB) {
            System.out.print(i + " ");
        }
       
    }
}