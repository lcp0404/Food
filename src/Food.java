public class Food {
    private String foodName;
    private String scienceName;
    private String group;
    private String subgroup;
    public Food(String foodName, String scienceName, String group, String subgroup) {
        this.foodName = foodName;
        this.scienceName = scienceName;
        this.group = group;
        this.subgroup = subgroup;
    }

    public String getName() {
        return foodName;
    }

    public String getScienceName() {
        return scienceName;
    }

    public String getGroup() {
        return group;
    }

    public String getSubGroup() {
        return subgroup;
    }

    public static Food fromLine(String line) {
        String[] fields = line.split(",");
        String foodName = fields[0];
        String scienceName = fields[1];
        String group = fields[2];
        String subgroup = fields[3];
        return new Food(foodName, scienceName, group, subgroup);
    }
}
