package Example_3;

/**
 * Created by den on 2017-01-15.
 */
public class Website {
    private String name;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
