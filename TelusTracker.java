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
 *                      Added Slenderman
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
        boolean flag = true; // Change to true if you do
        int totalMinutes = 0;
        int pagesCount = 0;

        printBanner();

        System.out.println("Enable affirmations? Press Y");
        String afirm = in.next();
        if (!afirm.equals("Y") || !afirm.equals("y")) {
            flag = true;
            System.out.println("Affirmations enabled\n");
        } else {
            flag = false;
            System.out.println("Affirmations disabled\n");
        }

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

                } else {
                    Random randomAff = new Random();
                    String randomAffirmation = getRandomAffirmation(randomAff);
                    Random randomJr = new Random();
                    String randomJR = getRandomJr(randomJr);

                    try {
                        int minutes = Integer.parseInt(input);

                        totalMinutes += minutes;
                        System.out.println("Current Sum: " + totalMinutes + "\n");
                        saveToLogFile(writer, dateStr, totalMinutes);
                        
                        if (totalMinutes %5 == 0){

                            if(pagesCount >= 8){
                                pagesCount = 0;
                                System.out.println("Slenderman");

                            }
                            System.out.println(slenderman(pagesCount) + "\n");
                            pagesCount++;

                        } else if (flag) {
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
        String randomResponse = getRandomBillyButcherResponse(random);

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

    private static String getRandomJr(Random random) {
        String[] jrs = {
                "Time and Space jr",
                "Fire and Ice jr",
                "Year jr",
                "People jr",
                "Way jr",
                "Day jr",
                "Man jr",
                "Thing jr",
                "Woman jr",
                "Life jr",
                "Child jr",
                "World jr",
                "School jr",
                "State jr",
                "Family jr",
                "Student jr",
                "Group jr",
                "Country jr",
                "Problem jr",
                "Hand jr",
                "Part jr",
                "Place jr",
                "Case jr",
                "Week jr",
                "Company jr",
                "System jr",
                "Program jr",
                "Question jr",
                "Work jr",
                "Government jr",
                "Number jr",
                "Night jr",
                "Point jr",
                "Home jr",
                "Water jr",
                "Room jr",
                "Mother jr",
                "Area jr",
                "Money jr",
                "Story jr",
                "Fact jr",
                "Month jr",
                "Lot jr",
                "Right jr",
                "Study jr",
                "Book jr",
                "Eye jr",
                "Job jr",
                "Word jr",
                "Business jr",
                "Issue jr",
                "Side jr",
                "Kind jr",
                "Head jr",
                "House jr",
                "Service jr",
                "Friend jr",
                "Father jr",
                "Power jr",
                "Hour jr",
                "Game jr",
                "Line jr",
                "End jr",
                "Member jr",
                "Law jr",
                "Car jr",
                "City jr",
                "Community jr",
                "Name jr",
                "President jr",
                "Team jr",
                "Minute jr",
                "Idea jr",
                "Kid jr",
                "Body jr",
                "Information jr",
                "Back jr",
                "Parent jr",
                "Face jr",
                "Others jr",
                "Level jr",
                "Office jr",
                "Door jr",
                "Health jr",
                "Person jr",
                "Art jr",
                "War jr",
                "History jr",
                "Party jr",
                "Result jr",
                "Change jr",
                "Morning jr",
                "Reason jr",
                "Research jr",
                "Girl jr",
                "Guy jr",
                "Moment jr",
                "Air jr",
                "Teacher jr",
                "Force jr",
                "Education jr",
                "Backjack jr"
        };
        return jrs[random.nextInt(jrs.length)];

    }

    private static String getRandomAffirmation(Random random) {
        String[] Affirmations = {
                "You're cracked",
                "So goated",
                "Kratom 2024",
                "Moving different",
                "You completed that task like Tom Brady",
                "Some people call you the OJ of Telus",
                "Damn was that task JFK ?  Cause you shot that shit in the head!",
                "Campbell was here",
                "Ask Roslyn what the time is (It will be 3 hours before you expect)",
                "21",
                "drue",
                "Wait you're goated",
                "I will not join the VC until you finish the next task",
                "Mix Bud Light with Texas Pete call that a Buddy Mary",
                "Dude you just got a Shiny task!",
                "Im feeling evidence on this next one",
                "JT Dunphy got kicked out for some reason",
                "Its going to get far worse before it gets any better",
                "I 1v5'd Cole Dilsworth and his posse: https://www.youtube.com/watch?v=cfH911cHqkI&ab_channel=soup",
                "Jordan stop flexin ya muscles",
                "BANG",
                "The Joker was here",
                "Did I tell you how much I love speeding?",
                "You want to hit a bowl so bad (do it)",
                "Hey Lineen!",
                "Fire and Ice",
                "Hamburger jr?",
                "if i had one wish i would use the big red button on at all",
                "Any backjackers in the vc?",
                "we have to hack into the malware",
                "I found scientific evidence that your built different",
                "[overwatch game chat] KILL YOUR SELF - Henry",
                "[emilio out in the woods at night] \"if I saw Campbell out here I would be eating liver for dinner\"",
                "sometimes in church ill just browse the r/cracksmokers subreddit",
                "When you're prairie dogging in the vc",
                "Be the person your dog thinks killed Hitler",
                "You own the Gaza Strip",
                "Yall ever listen to 'Mongolia' by Carti?",
                "Tonights stack: 3 Kratom Beers, 400MG CBD, 5MG melatonin, 2 8-balls",
                "Emilio O'Connor",
                "Trump Mugshot: https://ichef.bbci.co.uk/news/1024/cpsprodpb/13FCD/production/_130896818_donaldtrumpfullmugshot.jpg",
                "Baller",
                "You're balling harder than time and space",
                "Balling harder than LeBron",
                "You're as goated as a goat wearing goat socks on a mountain made of goat cheese.",
                "Asheville is calling",
                "Old people are going to die soon",
                "Your the G.O.A.T of all time",
                "That task was harder than time and space",
                "I <3 stealing",
                "I <3 shoplifting",
                "I <3 hurting others",
                "I <3 completing tasks",
                "I <3 killing",
                "I <3 looting",
                "I <3 my friends",
                "I <3 Alex",
                "I <3 Linneen",
                "I <3 scamming",
                "I <3 the infinite wasteland of time and space",
                "I <3 all Telus employeees",
                "Snape is my favorite character form Harry Potter",
                "Harry Potter kinda sucks",
                "Listen to DJ Smokey",
                "40 pound bag of shake",
                "I stole $35.23 worth of product from Walmart today",
                "I love stealing more than life itself",
                "Quit and start robbing people",
                "Rick and Morty is a fire show",
                "I love Brian from family guy",
                "Roger the Alian is a funny ass guy",
                "showing my gut to hot chicks",
                "Glaze Clan",
                "saying L marriage to my parents",
                "when you a neph on the outside but you got a unc soul",
                "just dropped a band at starbucks #youngwealthy",
                "lets get a 19 year old to replace feinstein",
                "im voting for chris christie bro he has been crackin me up all day",
                "yo can i hold a few hundred bucks to build a gaming pc",
                "the USA got clapped",
                "I never respected mountan dew",
                "And on the fifth day, god said \"fuck this shit, i'm jerking off in the shower.\"",
                "Going for a 20 min walk is like watching an episode of TV called My Neighborhood",
                "Huffing krazy glue rn",
                "So fly they called pest control ",
                "Antonio brown and doja cat dating. prediction is in. ",
                "Drinking lean with John Mayer",
                "I could have been studying rn",
                "what is the dog doing",
                "The mountaints < jacking off",
                "Everytime i see a cop I see an playstation square over the gun",
                "This line was sponsered by George Suros",
                "don't forget to get water…….and get High - Emilio",
                "Bumblegorp",
                "I maed u a waffel!!! (^w^)>#",
                "8====D~~~~",
                "If you dont do one more task im going to kill you",
                "Nobody is gangstalking you",
                "Your family loves you",
                "You're perfect the way you are",
                "Slitherman was here"

        };
        return Affirmations[random.nextInt(Affirmations.length)];

    }

    // Function to get a random response from Billy Butcher
    private static String getRandomBillyButcherResponse(Random random) {
        String[] BillyButcher = {
                "You did a great job, I'm proud of you!",
                "You deserve a nice bong rip after this!",
                "Wrap it up and spark that peace pipe!",
                "Time to let your hair down and blaze away!",
                "You've earned yourself a one-way ticket to relaxation station!",
                "Time to roll one up and chill like a sloth on a Sunday.",
                "You earned a break, go take a hit and watch the clouds float by, ya lazy bugger.",
                "Wrap up the day and blaze away - you've earned it, ya proper slacker.",
                "Kick back and relax, mate. Puff, puff, pass that stress away.",
                "Another day bites the dust. Time to hit the pen and mellow out.",
                "Clock out and chief down. It's high time for some relaxation.",
                "You've clocked off, now hit the Oxys and let the good vibes roll.",
                "Well done, now hit the shake and let the stress fade away like a bad memory.",
                "You've done your bit, now blaze it and forget about the day, ya weed-loving dreamer.",
                "Time to hit the hay and dream of fields of green. Goodnight, stoner.",
                "Time to hit a blinker and kick back!",
                "Crack open a cold Kratom Beer and relax, you've earned it!",
                "Kratom break, anyone?",
                "Wrap it up, it's 4:20 somewhere!",
                "If Telus had a 'Chill Mode', you'd be there, pal.",
                "Wrap it up and toss back that kratom, you herbal enthusiast.",
                "Time to call it a day and savor that kratom, 'cause reality sucks.",
                "Another day bites the dust. Grab your kratom, it's your sweet escape.",
                "Clock out and get your kratom fix. It's your ticket to la-la land, buddy.",
                "You've earned a break, now sip on that Kratom Beer and drift away.",
                "Well, well, it's quitting time. Kratom o'clock, my friend.",
                "You've done your part, now enjoy some kratom therapy.",
                "It's time to punch out and pop some kratom pills. Life's better through the haze.",
                "Wrap up the day and unwind with kratom. It's your herbal sedative, ain't it?",
                "You've hit the finish line, now hit that fucking kratom and forget the grind.",
                "You've hit the time limit, now hit that bong."
        };

        return BillyButcher[random.nextInt(BillyButcher.length)];
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

    private static void printBanner() {
        System.out.println(
                " ________         __                     ________                            __                                 ");
        System.out.println(
                "/        |       /  |                   /        |                          /  |                                ");
        System.out.println(
                "$$$$$$$$/______  $$ | __    __   _______$$$$$$$$/______   ______    _______ $$ |   __   ______    ______        ");
        System.out.println(
                "   $$ | /      \\ $$ |/  |  /  | /       |  $$ | /      \\ /      \\  /       |$$ |  /  | /      \\  /      \\       ");
        System.out.println(
                "   $$ |/$$$$$$  |$$ |$$ |  $$ |/$$$$$$$/   $$ |/$$$$$$  |$$$$$$  |/$$$$$$$/ $$ |_/$$/ /$$$$$$  |/$$$$$$  |      ");
        System.out.println(
                "   $$ |$$    $$ |$$ |$$ |  $$ |$$      \\   $$ |$$ |  $$/ /    $$ |$$ |      $$   $$<  $$    $$ |$$ |  $$/       ");
        System.out.println(
                "   $$ |$$$$$$$$/ $$ |$$ \\__$$ | $$$$$$  |  $$ |$$ |     /$$$$$$$ |$$ \\_____ $$$$$$  \\ $$$$$$$$/ $$ |            ");
        System.out.println(
                "   $$ |$$       |$$ |$$    $$/ /     $$/   $$ |$$ |     $$    $$ |$$       |$$ | $$  |$$       |$$ |            ");
        System.out.println(
                "   $$/  $$$$$$$/ $$/  $$$$$$/  $$$$$$$/    $$/ $$/       $$$$$$$/  $$$$$$$/ $$/   $$/  $$$$$$$/ $$/             ");
        System.out.println();
        System.out.println(
                "                         \"Getting Evil Money Since 2023\" (Sponsored by Billy Butcher)                                  ");
        System.out.println();
        System.out.println(
                "Controls:\nPress 0 to exit\nDisable affirmation mode with \"noAffirmations\"\nEnable affirmation mode with \"affirmations\"\nUse negative numbers to fix mistakes \n\n");

    }
}
