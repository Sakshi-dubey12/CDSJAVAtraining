import java.util.*;
public class ClassObjects {
    public static void main(String[] args) {
        //call the class and intialize the object
        Trainer trainer = new Trainer();
        System.out.println("Enter the trainer name");
        Scanner scanner = new Scanner(System.in);
        trainer.trainerName = scanner.nextLine();
        System.out.println("Enter the trainer technology");
        trainer.trainerTechnology = scanner.nextLine();

        String tname = trainer.nameCancatinates("pawan","sharma");
        System.out.println("Trainer Full Name in japan:" + tname);

        Student student = new Student();
        System.out.println("Enter the student name");
        Scanner sc = new Scanner(System.in);
        student.studentName = scanner.nextLine();
        System.out.println("Enter the student technology");
        student.EnrolledTechnology = scanner.nextLine();

        System.out.println(trainer.trainerTechnology +" "+ trainer.trainerName);

    }
}
class Trainer{
    String trainerName;
    String trainerTechnology;
    String FName;
    String LName;

    public static String nameCancatinates(String FName, String LName){
        return LName + FName;
    }


}
class Student{
    String studentName;
    String EnrolledTechnology;

}
