package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Take the file name as input from the user
    System.out.print("Enter the name of the file to read: ");
    String fileName = sc.nextLine();

    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
      String line;

      System.out.println("\nReading content from " + fileName + ":\n");

      // Read and print each line from the file
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("An error occurred while reading the file.");
      System.out.println("Error: " + e.getMessage());
    }

    sc.close();
  }
}
