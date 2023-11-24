import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIO {

    // Method to read a file and return its contents as an array of strings
    public String[] load(String filepath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
        return lines.toArray(new String[0]); // Convert list to array
    }

    // Method to save an array of strings to a file
    public void save(String filepath, String[] data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {
            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
