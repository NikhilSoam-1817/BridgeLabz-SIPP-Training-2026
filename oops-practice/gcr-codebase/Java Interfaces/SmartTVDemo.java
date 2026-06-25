interface StreamingService {
    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription Active");
    }
}

interface GamingService {
    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    public void streamMovie() {
        System.out.println("Streaming movie...");
    }

    public void playGame() {
        System.out.println("Playing game...");
    }

    // Resolving default method conflict
    public void showSubscriptionDetails() {
        System.out.println("Smart TV Premium Subscription Active");
    }
}

public class SmartTVDemo {
    public static void main(String[] args) {

        String[] movies = {
                "Avengers",
                "Interstellar",
                "Inception"
        };

        String[] games = {
                "FIFA",
                "Minecraft",
                "GTA V"
        };

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("\nMovies Available:");
        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\nGames Available:");
        for (String game : games) {
            System.out.println(game);
        }
    }
}