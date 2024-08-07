import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExample {
    public static void main(String[] args) {
        //file handling work on files: create,read,update,delete , access ,search the file
        // to create the file:-filename and extension
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fileName = scanner.nextLine();
        File file = new File(" " + fileName+".txt");
        // to check file is exist with same name or not
        String data =" ";
        try{

            if(!file.exists()){
                System.out.println("file does not exist");
                return;
            }
        //to check the file is already created or not
            else {
                System.out.println("file already exists");

//                //to write the data in ur file

                Scanner reader = new Scanner(file);
                while(reader.hasNextLine()){
                    data = reader.nextLine();
                }
                reader.close();

                FileWriter fileWriter = new FileWriter(file.getAbsolutePath());
                //write the file using file name and extension

                System.out.println("Write the message in your file");
                String message = scanner.nextLine();
                fileWriter.write(data + " " +message);
                fileWriter.close();
            }

          // search the string exist in file or not
            System.out.println("What u want to search");
            String search = scanner.nextLine();
            if (data.contains(search))
             {
                 System.out.println("found");

            }else{
                System.out.println("not found");
            }




        } catch (IOException e) {
            throw new RuntimeException(e);

        }

    }
}
