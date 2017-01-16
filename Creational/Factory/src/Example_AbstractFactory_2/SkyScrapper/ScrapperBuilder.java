package Example_AbstractFactory_2.SkyScrapper;

import Example_AbstractFactory_2.Builder;

/**
 * Created by den on 2017-01-14.
 */
public class ScrapperBuilder implements Builder {
    @Override
    public void BuildHouse() {
        System.out.println("Build SkyScrapper...");
    }
}
