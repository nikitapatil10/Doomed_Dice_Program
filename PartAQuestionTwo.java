/*
2. Calculate and display the distribution of all possible combinations that can be
obtained when rolling both Die A and Die B together. Show the math along with
the code!
Hint: A 6 x 6 Matrix.

 */
public class PartAQuestionTwo {
    public int[][] sumOfAllPossibleCombinations(int[] diceA,int[] diceB)
    {
        int[][] sumOfTwoDice = new int[6][6];
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                sumOfTwoDice[i][j] = diceA[i] + diceB[j];
                System.out.print(diceA[i] + "+" + diceB[j] +" ");
            }
            System.out.println();
        }

        return sumOfTwoDice;
    }

}
