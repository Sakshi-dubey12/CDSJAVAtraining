public class WhileLoopDemo {
    public static void main(String[] args){
        // to print sum of natural number 1 to 10
        int i = 1;
        int sum = 0;
        while (i <= 10)
        {

            System.out.println(i);
            i++;
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
