package Factory_Method.Example_2;

import Factory_Method.Example_1.Weight;

/**
 * Created by den on 2017-01-14.
 */
public class Tank {
    private String name;
    private Weight weight;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
