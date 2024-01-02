
/*****************************************************************************************************
 * Author:              A Beautiful Fish (who loves robbing, killing, stealing, and speeding)
 * 
 * Written:             09/25/23
 * Last updated:        09/28/23
 * 
 * Compilation:         javac TelusTracker.java
 * Execution:           java TelusTracker.java
 * 
 * Instructions:        Save the file to your downloads folder.
 *                      Create a new folder called TelusTracker (or whatever you want).
 *                      Open CMD or Terminal and type 'cd Downloads' + enter. 
 *                      Type 'cd TelusTracker' (or whatever you named the folder) + enter.
 *                      Type 'javac TelusTracker.java' + enter.
 *                      Type 'java TelusTracker.java' + enter.
 *                      If you already ran javac, you don't need to run it again, just 
 *                      'java TelusTracker.java'.
 *                       
 * Current version:     1.2
 * 
 * Changelog:           1.2 
 *                      Massive refactoring for code
 *                      Added controls to the welcome message
 *                      Added affirmations on each message
 *                      Added support to disable and enable affirmations
 *                      Added jr.java which will convert a list of nouns into jrs (for development)
 *                      Now when an affirmation displays, it is by a random jr
 *                      Added a Y/N for enabling affirmations off the rip 
 *                      Added Slenderman (seperate from affirmations)
 * 
 *                      1.1: 
 *                      Added exit case when input = 0.
 *                      Removed package declaration.
 *                      Added BillyButcher String array for end of day responses.
 *                      Log files are now saved in a seperate folder called 'Logs'.
 *                      Updated date to be more readble.
 *                      Added 'welcome' banner.
 *                      Updated error logs.
 *                      Added the hours + minutes to the final sum 
 *****************************************************************************************************/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class TelusTracker {
    // Constants
    private static final int MINUTES_IN_AN_HOUR = 60;

    // The freaking main function
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalMinutes = trackTime(in);
        in.close();

        displayResult(totalMinutes);
    }

    // Function to track time worked
    private static int trackTime(Scanner in) {
        boolean flag = true; // True means that affirmations are enabled
        int totalMinutes = 0;
        int pagesCount = 0;

        printArt.banner();

        System.out.println("Affirmations enabled by default\n");
        

        FileWriter writer = null;

        try {
            String dateStr = getCurrentTimestamp();

            createLogsFolderIfNotExists();

            String filePath = createLogFilePath(dateStr);
            writer = new FileWriter(filePath, true);

            while (true) {
                System.out.print("Enter current task time: ");
                String input = in.next();

                if (input.equals("0")) {
                    break;
                }

                if (input.equals("noAffirmations")) {

                    if (flag == false) {
                        System.out.println("Affirmations mode already disabled.\n");

                    } else {

                        flag = false;
                        System.out.println("Affirmations mode disabled\n");
                    }

                } else if (input.equals("affirmations")) {

                    if (flag == true) {
                        System.out.println("Affirmations mode already enabled.\n");

                    } else {

                        flag = true;
                        System.out.println("Affirmations mode enabled\nLETS FUCKING GO\n");
                    }

                } else if (input.equals("author")) { 
                    printArt.author();
                    
                } else {
                    Random randomAff = new Random();
                    String randomAffirmation = getRandom.affirmation(randomAff);

                    Random randomJr = new Random();
                    String randomJR = getRandom.jr(randomJr);

                    try {
                        int minutes = Integer.parseInt(input);

                        totalMinutes += minutes;
                        System.out.println("Current Sum: " + totalMinutes + "\n");
                        saveToLogFile(writer, dateStr, totalMinutes);

                        if (totalMinutes % 13 == 0) { // Secret slenderman sauce

                            if (pagesCount >= 8) {
                                pagesCount = 0;
                                System.out.println("Slenderman:\n");
                                printArt.slenderman();

                            }
                            System.out.println(slenderman(pagesCount) + "\n");
                            pagesCount++;

                        }
                        if(totalMinutes % 25 == 0){
                            printArt.mason();
                        }
                         else if (flag) {
                            System.out.println(randomAffirmation + " - " + randomJR + "\n");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Wrong input type. Please enter an integer :3\n");
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("An error occurred while saving to the log file: " + e.getMessage());
        } finally {
            closeLogFileWriter(writer);
        }

        return totalMinutes;
    }

    // Function to display the result
    private static void displayResult(int totalMinutes) {
        int hours = totalMinutes / MINUTES_IN_AN_HOUR;
        int remainingMinutes = totalMinutes % MINUTES_IN_AN_HOUR;

        Random random = new Random();
        String randomResponse = getRandom.billyButcherResponse(random);

        if (totalMinutes >= 480) {
            System.out.println("\nCongratulations! You worked 8+ hours today!\n");
        }

        System.out.println(
                "Final sum: " + totalMinutes + " minutes or " + hours + " hours, " + remainingMinutes + " minutes");
        System.out.println("\nBilly Butcher says: \"" + randomResponse + "\"\n");
    }

    // Function to get the current timestamp
    private static String getCurrentTimestamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
        return dateFormat.format(new Date());
    }

    // Function to create the 'Logs' folder if it doesn't exist
    private static void createLogsFolderIfNotExists() {
        File logsFolder = new File("Logs");
        if (!logsFolder.exists()) {
            logsFolder.mkdir();
        }
    }

    // Function to create a log file path
    private static String createLogFilePath(String dateStr) {
        return "Logs" + File.separator + "Telus Log - " + dateStr + ".txt";
    }

    // Function to save the time worked to a log file
    private static void saveToLogFile(FileWriter writer, String dateStr, int totalMinutes) throws IOException {
        writer.write("[" + dateStr + "] Sum: " + totalMinutes + "\n");
        writer.flush();
    }

    // Function to close the log file writer
    private static void closeLogFileWriter(FileWriter writer) {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException e) {
                System.err.println("Error closing the log file: " + e.getMessage());
            }
        }
    }

    private static String slenderman(int count) {
        String[] pages = {
                "Pages 1/8",
                "Pages 2/8",
                "Pages 3/8",
                "Pages 4/8",
                "Pages 5/8",
                "Pages 6/8",
                "Pages 7/8",
                "Pages 8/8"
        };
        return pages[count];
    }

    
}
