
public class SmallestArray {
    public static void main(String[] args) {
        int[] array = {1, 7, 3, 11, 24, 9};
        int smallest = findSmallest(array);
        System.out.println("The smallest number is: " + smallest);
    }

    public static int findSmallest(int[] array) {
        int min = array[0]; // Assume the first element is the smallest
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
