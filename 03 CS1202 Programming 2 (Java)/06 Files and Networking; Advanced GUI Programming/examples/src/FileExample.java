
/**
 * Make a list of some nice names from file
 * OUTPUT
 * Enter genre (girl or boy):
 * girl
 * Asher
 * Aurora
 * Ava
 * Chloe
 * Grayson
 * Logan
 * Luna
 * Michael
 * Olivia
 * Sophia
 */

import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class FileExamples {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter genre (girl or boy): ");
            String genre = sc.nextLine();

            TreeSet<String> names = getNamesFromFile(genre);

            // Print all recommendation
            for (String name : names) {
                System.out.println(name);
            }

            saveOutputFile(names);
        }
    }

    static File getInputFileNameFromUser() {
        JFileChooser fileDialog = new JFileChooser();
        // Set some initial value for dialog
        fileDialog.setDialogTitle("Select file to save");
        int option = fileDialog.showSaveDialog(null);
        if (option != JFileChooser.APPROVE_OPTION)
            return null;
        else
            return fileDialog.getSelectedFile();
    }

    /**
     * Print an output file with names containing "a" character
     * 
     * @param names
     */
    static void saveOutputFile(TreeSet<String> names) {
        File data = getInputFileNameFromUser();
        PrintWriter result;

        try {
            if (data == null) {
                data = new File("result.txt");
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
     * Get names by genre
     * @param genre
     * @return TreeSet of names
     */
    static TreeSet<String> getNamesFromFile(String genre) {
        TreeSet<String> nameCollection = new TreeSet<>();

        BufferedReader in;

        try {
            if (genre.equals("girl"))
                in = new BufferedReader(new FileReader("girl_names.txt"));
            else
                in = new BufferedReader(new FileReader("boy_names.txt"));

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
