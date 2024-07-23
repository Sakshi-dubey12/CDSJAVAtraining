import java.util.Scanner;
public class terminalVoting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String ans = (age >= 18) ? "You are Eligible for vote" : "You are not Eligible for vote";
        System.out.println(ans);
    }
}
