package Example_2;

/**
 * Created by den on 2017-01-14.
 */
public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder(new AbramsBuilder());
        Tank tank = builder.buildTank();

        System.out.println(tank);
    }
}
