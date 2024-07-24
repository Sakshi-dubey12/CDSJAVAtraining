import java.util.*;
public class MethodStatement {
    public static void main(String[] args){
        printMyName();

    }
    private static void printMyName(){
        Scanner scanner = new Scanner(System.in);
        String myName = scanner.nextLine();
        System.out.println(myName);
    }
}
