import java.util.*;
public class AreaOfRectangel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length");
        int len = scanner.nextInt();
        System.out.println("Enter your breath");
        int breath = scanner.nextInt();
        System.out.println("Area of rectangel " + AreaOfRectangel(len,breath));
    }
    public static int AreaOfRectangel(int len,int breath){
        return len*breath;

    }
}
