import java.util.*;
public class SwitchStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        switch(marks) {
            case 10:
                System.out.println("You are Failed");
                break;
            case 50:
                System.out.println("You are passed");
                break;
            case 100:
                System.out.println("Congrats , You are Topper");
                break;
        }


        }

    }

