package basic;

/**
 * After creation, its length is fixed.
 */
public class Array {

    public static void main(String[] args) {

        // declaration does not actually create an array;
        // it simply tells the compiler that this variable will hold an array of the specified type.
        int[] numbers;

        // discouraged
        // int numbers[];

        // create array and allocate memory for 10 integers
        numbers = new int[10];

        // assign value
        numbers[0] = 100;
        numbers[1] = 200;

        // create and initialize an array
        int[] rollNumbers = {
            10, 20, 30, 40, 50,
                60, 70, 80, 90, 100
        };

        // multidimensional array is an array whose components are themselves arrays.
        // rows are allowed to vary in length,
        String[][] namesAndDesignations = {
                {"Jobayer", "Jayed", "Junayed"}, // 3
                {"Software Engineer", "ASP"}    // 2
        };

        for (int i = 0; i < namesAndDesignations.length; i++) {
            for (int j = 0; j < namesAndDesignations[i].length; j++) {
                System.out.print(namesAndDesignations[i][j] + "\t");
            }
            System.out.println();
        }

        // Copy Array
        int[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] dest = new int[10];

        // source, starting position in source, dest, starting position in dest, number of elements to be coppied
        System.arraycopy(source, 0, dest, 5, 5);

        for (int i : dest) {
            System.out.print(i + " ");
        }
    }
}
