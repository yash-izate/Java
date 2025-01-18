package File_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        // File name to write the content
        String fileName = "twinkle.txt";

        // Content to be written to the file
        String poem = """
                Twinkle, twinkle, little star,
                How I wonder what you are!
                Up above the world so high,
                Like a diamond in the sky.

                Twinkle, twinkle, little star,
                How I wonder what you are!
                """;

        try (FileWriter writer = new FileWriter(fileName)) {
            // Write the poem to the file
            writer.write(poem);
            System.out.println("Poem written successfully to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
