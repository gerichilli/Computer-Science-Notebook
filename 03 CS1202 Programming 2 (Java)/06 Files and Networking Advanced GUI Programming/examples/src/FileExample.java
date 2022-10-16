import javax.swing.*;
import java.io.*;
import java.util.TreeSet;

/*
Make a list of some nice names from file
OUTPUT
Asher
Aurora
Ava
Chloe
Grayson
Logan
Luna
Michael
Olivia
Sophia
Writing to C:\Users\Admin\Documents\test.txt
 */

public class FileExample {
    public static void main(String[] args) {
        TreeSet<String> names = getNamesFromFile();

        // Print all recommendation
        for (String name : names) {
            System.out.println(name);
        }

        saveOutputFile(names);
    }

    /**
     * Print an output file with names containing "a" character
     * @param names TreeSet of nice names
     */
    static void saveOutputFile(TreeSet<String> names) {
        File data;
        PrintWriter result;

        try {
            JFileChooser fileDialog = new JFileChooser();
            // Set some initial value for dialog
            fileDialog.setDialogTitle("Select file to save");
            int option = fileDialog.showSaveDialog(null);

            if (option != JFileChooser.APPROVE_OPTION) {
                System.out.println("Created result.txt");
                data = new File("result.txt");
                System.out.println("Writing to result.txt");
            } else {
                data = fileDialog.getSelectedFile();
                System.out.print("Writing to " + data.getAbsolutePath());
            }

            result = new PrintWriter(data);

            for (String name : names) {
                if (name.contains("a")) {
                    result.println(name);
                }
            }

            result.close(); // Close result file
        } catch (IOException e) {
            System.out.println("Can not write the file: " + e.getMessage());
        }
    }

    /**
     * Get nice names
     * @return TreeSet of names
     */
    static TreeSet<String> getNamesFromFile() {
        TreeSet<String> nameCollection = new TreeSet<>();

        BufferedReader in;

        try {
            in = new BufferedReader(new FileReader("names.txt"));

            String line = in.readLine();
            // Add words to TreeSet
            while (line != null) {
                nameCollection.add(line); // Add line to the nameCollection
                line = in.readLine(); // Read next line
            }

            in.close(); // Close input file

        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Can not read the file: " + e.getMessage());
        }
        return nameCollection;
    }
}
