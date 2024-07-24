import java.util.*;
public class StringStatement {
    public static void main(String[] args){
        String name ="sakshi Dubey";
        System.out.println(name.toUpperCase());
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String sname = scanner.nextLine();
        // use function sname.equals
        if(sname.equals("sakshi dubey"))
        {
            System.out.println("allowed");
        }
        else{
            System.out.println("not allowed");
        }


    }
}
