import java.util.List;

public interface ISaveable {

    List<String> saveValues();
    void loadValues(List<String> values);
}