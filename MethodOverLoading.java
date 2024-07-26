import java.util.Scanner;
public class MethodOverLoading {
    public static void main(String[] args){
        System.out.println("Enter the todays earning and expenses");
        Scanner sc = new Scanner(System.in);
        int earning = sc.nextInt();
        int expense = sc.nextInt();
        int saving = todaySavings(earning,expense);
        System.out.println("Saving is:"+ saving);
    }
    public static int todaySavings(int earning,int expense){
    return (earning - expense);
}
}
