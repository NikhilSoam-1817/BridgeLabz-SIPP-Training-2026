interface TextModeration {

    boolean isOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive language allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        return post.toLowerCase().contains("badword");
    }
}

interface SpamDetection {

    boolean isSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam content is prohibited.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    public boolean isOffensive(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    public boolean isSpam(String post) {
        return post.toLowerCase().contains("buy now")
                || post.toLowerCase().contains("click here");
    }

    // Resolve default method conflict
    public void displayModerationPolicy() {
        System.out.println("Platform Policy: No Spam and No Offensive Content.");
    }
}

public class ModerationDemo {
    public static void main(String[] args) {

        String[] posts = {
                "Buy now and get 50% discount!",
                "You are a badword",
                "Java is an amazing language",
                "Click here to win money"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println("\nPost Analysis:");

        for (String post : posts) {

            if (moderator.isSpam(post)) {
                System.out.println("\"" + post + "\" -> Spam Post");
            }
            else if (moderator.isOffensive(post)) {
                System.out.println("\"" + post + "\" -> Offensive Post");
            }
            else {
                System.out.println("\"" + post + "\" -> Valid Post");
            }
        }
    }
}