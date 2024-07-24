public class GreatestArray {
    public static void main(String[] args) {
        int[] numbers = {1, 7, 3, 11, 24, 9};
        int max = numbers[0]; // Assume the first element is the maximum

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if current element is greater
            }
        }

        System.out.println("The greatest number in the array is: " + max);
    }
}

