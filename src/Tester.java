import java.io.FileNotFoundException;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        FoodDatabase db = new FoodDatabase();
        try {
            db.loadFromFile("src/data.txt");

            // Get all the foods in the "Fruits" group
            List<Food> fruits = db.getFoodsByGroup("Fruits");

            // Print the names of the fruits
            System.out.println("Fruits:");
            for (Food fruit : fruits) {
                System.out.println("- " + fruit.getName());
            }

            // Get all the foods in the "Meats" group
            List<Food> meats = db.getFoodsByGroup("Herbs and Spices");

            // Print the names of the meats
            System.out.println("\nHerbs and Spices");
            for (Food meat : meats) {
                System.out.println("- " + meat.getName());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
