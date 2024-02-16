import java.io.*;

public class Tweaker {
    public static void tweaking() {
        // Command to execute, replace "dir" with your desired command
        String[] command = { "cmd.exe", "/c", "start", "cmd.exe", "/k", "TIMEOUT /T 0 /NOBREAK && exit" };

        try {
            ProcessBuilder builder = new ProcessBuilder(command);
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }

            // Pause for 0.2 seconds
            Thread.sleep(200);

            // Send the exit command to close the terminal window
            ProcessBuilder exitBuilder = new ProcessBuilder("cmd.exe", "/c", "exit");
            exitBuilder.start();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
