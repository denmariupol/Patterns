package Example_AbstractFactory_2.Living_House_Project;

import Example_AbstractFactory_2.Builder;
import Example_AbstractFactory_2.GroupTeam;
import Example_AbstractFactory_2.Ingineer;
import Example_AbstractFactory_2.Supplier;

/**
 * Created by den on 2017-01-14.
 */
public class CreateLivingHouseTeam implements GroupTeam {
    @Override
    public Builder getBuilder() {
        return new LivingHouseBuilder();
    }

    @Override
    public Supplier getSupplier() {
        return new LivingHouseSupplier();
    }

    @Override
    public Ingineer getIngineer() {
        return new LivingHouseIngineer();
    }
}
