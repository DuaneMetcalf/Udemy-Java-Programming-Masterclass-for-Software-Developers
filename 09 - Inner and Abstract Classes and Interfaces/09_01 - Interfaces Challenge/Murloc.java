import java.util.ArrayList;
import java.util.List;

public class Murloc implements ISaveable {

    private String name;
    private int health;
    private int strength;


    public Murloc(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;

    }

    @Override
    public List<String> saveValues() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.health);
        values.add(2, "" + this.strength);

        return values;
    }

    @Override
    public void loadValues(List<String> values) {
        if ((values != null) && (values.size() > 0)) {
            this.name = values.get(0);
            this.health = Integer.parseInt(values.get(1));
            this.strength = Integer.parseInt(values.get(2));
        }
    }

    @Override
    public String toString() {
        return "Murloc{" +
                "name = '" + this.name + '\'' +
                ", health = " + this.health +
                ", strength = " + this.strength + '\'' +
                '}';
    }

}