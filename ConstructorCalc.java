import java.util.Scanner;

public class ConstructorCalc {

    public static void main(String[] args) {
     CalculationClass obj = new CalculationClass();
    }
}
class  CalculationClass {
    int a;
    int b;
    int operation;

    public CalculationClass() {
        System.out.println("Enter the first number: ");
        Scanner scanner = new Scanner(System.in);
        this.a = scanner.nextInt();
        System.out.println("Enter the second number:");
        this.b = scanner.nextInt();
        System.out.println("Enter 1 for addtion , 2 for Substraction , 3 for multiplication , 4 for division");
        this.operation = scanner.nextInt();
        operation();

    }

    public void operation() {
        switch (this.operation) {
            case 1:
                System.out.println("Addition: " + (this.a + this.b));
                break;
            case 2:
                System.out.println("Subtraction: " + (this.a - this.b));
                break;
            case 3:
                System.out.println("Multiplication: " + (this.a * this.b));
                break;
            case 4:
                System.out.println("Division: " + (this.a / this.b));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}
