package abstr;

/**
 * Created by den on 2017-01-05.
 */
public abstract class Beverage {
    protected int size;
    protected String description = "Unknown Beverage";
    public String getDescription(){
        return description;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public abstract double cost();

}
