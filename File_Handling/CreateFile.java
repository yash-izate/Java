package File_Handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
  public static void main(String[] args) {
    // Specify the file name and path
    String fileName = "twinkle.txt";
    File file = new File(fileName);

    try {
      // Create the file
      if (file.createNewFile()) {
        System.out.println("File created: " + file.getName());
        System.out.println("File path: " + file.getAbsolutePath());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred while creating the file.");
      e.printStackTrace();
    }
  }
}
