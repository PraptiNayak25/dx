public class simplecalculator {
    
    public static void main(String[] args) {
        // Hardcoded array of integers
        int[] numbers = {12, 45, 7, 89, 23, 56, 34};

        // Initialize variables
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        // Calculate sum, max, and min
        for (int num : numbers) {
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // Calculate average
        //double average = (double) sum / numbers.length;

        // Display results
       // System.out.println("Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        //System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
