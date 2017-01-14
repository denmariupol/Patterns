package Example_AbstractFactory_2.Living_House_Project;

import Example_AbstractFactory_2.Supplier;

/**
 * Created by den on 2017-01-14.
 */
public class LivingHouseSupplier implements Supplier {
    @Override
    public void SupplyBuilding() {
        System.out.println("Supply living house with materials...");
    }
}
