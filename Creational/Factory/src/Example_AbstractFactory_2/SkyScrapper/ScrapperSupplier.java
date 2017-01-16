package Example_AbstractFactory_2.SkyScrapper;

import Example_AbstractFactory_2.Supplier;

/**
 * Created by den on 2017-01-14.
 */
public class ScrapperSupplier implements Supplier {
    @Override
    public void SupplyBuilding() {
        System.out.println("Supply skyscrapping building...");
    }
}
