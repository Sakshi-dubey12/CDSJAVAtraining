import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVFile {
    public static void main(String[] args) {
        //to create csv file
        File file = new File("myFile.csv");
        //to check file already exits or not
        try {
            if(file.createNewFile())
            {
                System.out.println("File is created");
            }else{
                System.out.println("file is not created");
            }
            System.out.println("Enter Student name");
            Scanner scanner = new Scanner(System.in);
            String data = scanner.nextLine();
            FileWriter Writer = new FileWriter(file);
            Writer.write(scanner.nextLine());
            Writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //to insert the data into csv file

    }
}
