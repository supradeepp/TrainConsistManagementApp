import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create LinkedList
        LinkedList<String> trainConsist = new LinkedList<>();

        // Step 3: Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train: " + trainConsist);

        // Step 4: Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        System.out.println("After adding Pantry Car: " + trainConsist);

        // Step 5: Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Step 6: Final Output
        System.out.println("Final Train Consist: " + trainConsist);

        System.out.println("Ordered structure maintained successfully.");
    }
}
