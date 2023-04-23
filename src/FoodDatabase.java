import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodDatabase {
    private List<Food> foods;

    public FoodDatabase() {
        this.foods = new ArrayList<>();
    }

    public void loadFromFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Food food = Food.fromLine(line);
            this.foods.add(food);
        }

        scanner.close();
    }

    public List<Food> getFoods() {
        return this.foods;
    }

    public List<Food> getFoodsByGroup(String group) {
        List<Food> foodsByGroup = new ArrayList<>();
        for (Food food : this.foods) {
            if (food.getGroup().equalsIgnoreCase(group)) {
                foodsByGroup.add(food);
            }
        }
        return foodsByGroup;
    }
}
