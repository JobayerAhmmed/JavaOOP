package basic;

/**
 * Created by bsse0 on 8/12/2017.
 */
public class BreakStatement {
    public static void main(String[] args) {

        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };

        int searchFor = 7;
        boolean foundIt = false;
        int i = 0;
        int j = 0;

    search:
        for (i = 0; i < numbers.length; i++) {
            for (j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == searchFor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchFor + " at " + i + ", " + j);
        } else {
            System.out.println(searchFor + " not in the array");
        }
    }
}
