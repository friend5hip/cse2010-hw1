package cse2010.hw1;

public class Utils {

    /**
     * Find an index of an element matching `target`.
     * @param xs int array
     * @param target element to be found
     * @return index of a matching element, -1 otherwise
     */
    public static int findIndex(int[] xs, int target) {
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Calculate the sum of an array.
     * @param xs double array
     * @return sum of an array
     */
    public static double sum(double[] xs) {
        double sum = 0.0;

        for (int i = 0; i < xs.length; i++) {
            sum += xs[i];
        }
        return sum;
    }

    /**
     * Reverse the elements of a String array. For example, ["A", "BB", "C"] => ["C", "BB", "A"]
     * @param xs String array
     * @return a newly created array containing elements of xs in reversed order
     */
    public static String[] reverse(String[] xs) {
        String [] reverseXs = new String[xs.length];
        int j = 0;

        for (int i = xs.length - 1; i >= 0; i--) {
            reverseXs[j] = xs[i];
            j++;
        }
        return reverseXs;
    }

    /**
     * Swap elements at position i and j in array xs
     * @param xs integer array
     * @param i index of element to be swapped
     * @param j index of element to be swapped
     */
    public static void swap(int[] xs, int i, int j) {
        int temp = xs[i];
        xs[i] = xs[j];
        xs[j] = temp;
    }

    /**
     * Reverse the elements of a String array in place without creating a new array.
     * Input array xs itself must be transformed to an array containing elements
     * in reversed order.
     * For example, ["A", "BB", "C"] => ["C", "BB", "A"].
     * @param xs String array
     */
    public static void reverse_in_place(String[] xs) {
        for (int i = 0; i < xs.length / 2; i++) {
            String temp = xs[i];
            xs[i] = xs[xs.length - 1 - i];
            xs[xs.length - 1 - i] = temp;
        }
    }

    /**
     * Returns an array containing running averages of an array.
     * @param xs int array
     * @return an array containing running average
     *
     * Given an input xs = [1, 2, 3, 4], `average()` returns a new array
     * containing running averages [1.0, 1.5, 2.0, 2.5].
     * Here,
     *      1.0 = 1 / 1
     *      1.5 = (1 + 2) / 2
     *      2.0 = (1 + 2 + 3) / 3
     *      2.5 = (1 + 2 + 3 + 4) / 4
     */
    public static double[] average(int[] xs) {
        double[] runningAvg = new double[xs.length];
        double sum = 0.0;

        for (int i = 0; i < xs.length; i++) {
            sum += xs[i];
            runningAvg[i] = sum / (i+1); 
        }
        return runningAvg;
    }

}
