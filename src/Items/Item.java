package Items;

public interface Item {
    String name = "Unknown";
    double weight = 0.0;
    double value = 0.0;

    String getName();
    void setName(String name);

    double getWeight();
    void setWeight(double weight);

    double getValue();
    void setValue(double value);

}
