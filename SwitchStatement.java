import java.util.*;
public class SwitchStatement {
    public static void main(String[] args){
        System.out.println("Enter Student marks");
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
            default :
                System.out.println("Your marks is not in criteria");
        }


        }

    }

