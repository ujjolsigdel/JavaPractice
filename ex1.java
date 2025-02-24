
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        System.out.println(FileExercise.getWord("ductionaryyy.txt","sPaNIsH"));
    }
}

class FileExercise {
    public static String getWord(String fileName, String language) {
        File file = new File(fileName);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splitted = line.split(",");

                if (splitted.length == 2) {
                    String word = splitted[0].trim();
                    String lang = splitted[1].trim();

                    if (lang.equalsIgnoreCase(language)) {
                        return word;
                    }
                }
            }
            return "WORD NOT FOUND.";
        } catch (FileNotFoundException e) {
            return "FILE NOT FOUND!";
        }
    }
}

