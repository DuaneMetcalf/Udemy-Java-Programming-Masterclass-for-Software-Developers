import java.util.ArrayList;
import java.util.List;

public class Warlock implements ISaveable{

    private String name;
    private int health;
    private int mana;
    private int spellPower;
    private String weapon;

    public Warlock(String name, int health, int mana, int spellPower, String weapon) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.spellPower = spellPower;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public List<String> saveValues() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.health);
        values.add(2, "" + this.mana);
        values.add(3, "" + this.spellPower);
        values.add(4, this.weapon);
        return values;
    }

    @Override
    public void loadValues(List<String> values) {
        if((values != null) && (values.size() > 0)){
            this.name = values.get(0);
            this.health = Integer.parseInt(values.get(1));
            this.mana = Integer.parseInt(values.get(2));
            this.spellPower = Integer.parseInt(values.get(3));
            this.weapon = values.get(4);
        }
    }

    @Override
    public String toString() {
        return "Warlock{" +
                "name = '" + this.name + '\'' +
                ", health = " + this.health +
                ", mana = " + this.mana +
                ", spellPower = " + this.spellPower +
                ", weapon = '" + this.weapon + '\'' +
                '}';
    }

}