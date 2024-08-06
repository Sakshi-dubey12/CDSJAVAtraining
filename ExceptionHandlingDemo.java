public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            // ArithmeticException
            int a = 100 / 0;
            System.out.println(a);

            // NumberFormatException
            String name = "Rohit Sharma";
            int i = Integer.parseInt(name);
            System.out.println(i);

            // NullPointerException
            String fullname = null;
            String fname = "";
            if (fullname == fname) {
                System.out.println("ss");
            } else {
                System.out.println("else");
            }

            //OutofBoundException
            int[] arr = { 1, 2, 3, 4, 5 };
            System.out.println(arr[5]);

            // NullPointerException
            String collegeName = null;
            System.out.println(collegeName.length());
        } catch (Exception e) {
            if (e instanceof ArithmeticException) {
                System.out.println("ArithmeticException");
            } else if (e instanceof NumberFormatException) {
                System.out.println("NumberFormatException");
            } else if (e instanceof NullPointerException) {
                System.out.println("NullPointerException");
            } else if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("ArrayIndexOutOfBoundsException");
            } else {
                System.out.println("This is finally");
            }
        }
    }
}