import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEncryptionExample {
    public static void main(String[] args) {
        try {
            File inputFile = new File("Copy.txt");
            FileReader reader = new FileReader(inputFile);
            FileWriter writer = new FileWriter("paste.txt");

            int character;
            while ((character = reader.read()) != -1) {
                if (Character.isLetter(character)) {
                    character = (character - 'A' + 1) % 26 + 'A'; // Caesar cipher with a shift of 1
                }
                writer.write(character);
            }

            reader.close();
            writer.close();
            System.out.println("File encrypted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}