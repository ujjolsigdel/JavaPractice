import java.io.*;

public class Ex14 {

    public static class FileExercise {
        public static void ReadToScreen(String fileName) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File is not found!");
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file: " + e.getMessage());
            }
        }
    }
    public static void main(String[] args){
        FileExercise.ReadToScreen("D:\\prog2\\java\\src\\test.txt"); // file path

    }
}
