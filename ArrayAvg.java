public class ArrayAvg {
    public static void main(String[] args) {
        int[] numbers = {1, 7, 3, 11, 24, 9};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println("The average is: " + average);
    }
}
