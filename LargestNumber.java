public class LargestNumber {
    public static void main(String[] args) {
        int a = 25;
        int b = 42;
        int c = 17;

        int largest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("The largest number is: " + largest);
    }
}
