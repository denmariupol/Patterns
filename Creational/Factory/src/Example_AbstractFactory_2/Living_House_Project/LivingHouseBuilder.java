package Example_AbstractFactory_2.Living_House_Project;

import Example_AbstractFactory_2.Builder;

/**
 * Created by den on 2017-01-14.
 */
public class LivingHouseBuilder implements Builder {
    @Override
    public void BuildHouse() {
        System.out.println("Build living house...");
    }
}
