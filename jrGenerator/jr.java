import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class jr {
    public static void main(String[] args) {
        String[] nouns = new String[] {
                "time",
                "year",
                "people",
                "way",
                "day",
                "man",
                "thing",
                "woman",
                "life",
                "child",
                "world",
                "school",
                "state",
                "family",
                "student",
                "group",
                "country",
                "problem",
                "hand",
                "part",
                "place",
                "case",
                "week",
                "company",
                "system",
                "program",
                "question",
                "work",
                "government",
                "number",
                "night",
                "point",
                "home",
                "water",
                "room",
                "mother",
                "area",
                "money",
                "story",
                "fact",
                "month",
                "lot",
                "right",
                "study",
                "book",
                "eye",
                "job",
                "word",
                "business",
                "issue",
                "side",
                "kind",
                "head",
                "house",
                "service",
                "friend",
                "father",
                "power",
                "hour",
                "game",
                "line",
                "end",
                "member",
                "law",
                "car",
                "city",
                "community",
                "name",
                "president",
                "team",
                "minute",
                "idea",
                "kid",
                "body",
                "information",
                "back",
                "parent",
                "face",
                "others",
                "level",
                "office",
                "door",
                "health",
                "person",
                "art",
                "war",
                "history",
                "party",
                "result",
                "change",
                "morning",
                "reason",
                "research",
                "girl",
                "guy",
                "moment",
                "air",
                "teacher",
                "force",
                "education"
        };
        StringBuilder result = new StringBuilder();

        for (String noun : nouns) {
            // Capitalize the first letter of each word
            String[] words = noun.split(" ");
            StringBuilder capitalizedNoun = new StringBuilder();
            for (String word : words) {
                if (!word.isEmpty()) {
                    char firstLetter = Character.toUpperCase(word.charAt(0));
                    String restOfWord = word.substring(1);
                    capitalizedNoun.append(firstLetter).append(restOfWord).append(" ");
                }
            }

            // Remove the extra space at the end and append ' jr'
            String modifiedNoun = "\"" + capitalizedNoun.toString().trim() + " jr\",";
            result.append(modifiedNoun).append("\n");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("jrs.txt"))) {
            writer.write(result.toString());
            System.out.println(
                    "Words with quotes, capitalized first letters, and ' jr,\"' appended have been saved to 'jrs.txt'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
