import java.util.Scanner;

public class GreetingApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter your name: ");
            String name = scanner.nextLine();
            System.out.println(buildGreeting(name));
        }
    }

    /**
     * Build a greeting message for the supplied name. If the name
     * is null or empty the message indicates that no name was provided.
     */
    public static String buildGreeting(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Hello! (no name provided)";
        }
        return "Hello, " + name + "! Welcome.";
    }
}
