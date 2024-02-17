package fartGenerator;

import java.io.*;

public class fart {
    public static void main(String[] args) {
        String filePath = "C:/Users/Campbell/Projects/Java/TelusTracker/fartGenerator/chris.txt";
        printFart(filePath);
    }

    public static void printFart(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath));
                BufferedWriter bw = new BufferedWriter(new FileWriter(filePath + "_temp"))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write("System.out.println(\"" + line + "\");");
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

   
        // Replace the original file with the modified file
        File originalFile = new File(filePath);
        File tempFile = new File(filePath + "_temp");
        if (tempFile.renameTo(originalFile)) {
            System.out.println("System.out.println statements added to the file successfully.");
        } else {
            System.out.println("Error occurred while updating the file.");
        }
    }
}
