public class NaturalNumberSumForLoop {
    public static void main(String[] args) {
        //increment order
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            sum += i; //sum = sum + i
        }
        System.out.println();
        System.out.println(sum);

    }
}
