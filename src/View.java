import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class View {

    private TSVLogParser parser;
    private List<Log> logEntries;

    private final Controller controller;
    private final Scanner scanner = new Scanner(System.in);

    public View() throws IOException {
        this.parser = new TSVLogParser(); // Initialize parser
        this.logEntries = parser.parse("src/evenimente.tsv"); // Parse logs
        this.controller = new Controller(logEntries); // Initialize controller with logs
    }

    public void menu() {
        while (true) {
            System.out.println();
            System.out.println("Press:");
            System.out.println("1. Sort by difficulty");
            System.out.println("2. Avengers with at least one success");
            System.out.println("3. Sort Avengers' scores");
            String input = scanner.nextLine();

            switch (input) {
//                case "1":
//                    controller.sortDifficulty();
//                    break;
//                case "2":
//                    controller.oneSuccess();
//                    break;
//                case "3":
//                    controller.calculateAndSaveResults("src/logs/result.txt");
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
