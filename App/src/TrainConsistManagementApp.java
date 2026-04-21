import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

     public static void main(String[] args) {

          // Step 1: Welcome Message
          System.out.println("=== Train Consist Management App ===");

          // Step 2: Create LinkedHashSet
          Set<String> trainFormation = new LinkedHashSet<>();

          // Step 3: Add bogies
          trainFormation.add("Engine");
          trainFormation.add("Sleeper");
          trainFormation.add("Cargo");
          trainFormation.add("Guard");

          // Step 4: Add duplicate
          trainFormation.add("Sleeper"); // duplicate (ignored)

          // Step 5: Display final formation
          System.out.println("Final Train Formation: " + trainFormation);

          System.out.println("Duplicates are removed, order is preserved.");
     }
}
