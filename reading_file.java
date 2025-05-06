import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class reading_file {
    public static void main(String[] sgrs) {
        try {
            Scanner scanner = new Scanner(new File("input.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();

        }
    }
}
