package basic;

/**
 * Created by bsse0 on 8/13/2017.
 */
public class ArbitraryNumberOfArguments {

    public static void main(String[] args) {

        // call with argument list of type double
        getSum("Jobayer", 10, 20.5, 30);

        // call with double array
        double[] myArray = {5.5, 10.6, 11};
        getSum("Jayed", myArray);

        // call with no value
        getSum("Junayed");
    }

//    use varargs when you don't know how many of a particular type of argument will be passed to the method.
//    It's a shortcut to creating an array manually.
//    The method can be called either with an array or with a sequence of arguments.
//    The code in the method body will treat the parameter as an array in either case.
//    To use varargs, you follow the type of the last parameter by an ellipsis (three dots, ...)
//    The method can then be called with any number of that parameter, including none.
    public static void getSum(String name, double... numbers) {
        int n = numbers.length;
        double sum = 0;
        for (double number :
                numbers) {
            sum += number;
        }
        System.out.println(name + ": " + sum);
    }
}
