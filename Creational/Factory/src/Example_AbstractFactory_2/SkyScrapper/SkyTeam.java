package Example_AbstractFactory_2.SkyScrapper;

import Example_AbstractFactory_2.Builder;
import Example_AbstractFactory_2.GroupTeam;
import Example_AbstractFactory_2.Ingineer;
import Example_AbstractFactory_2.Supplier;

/**
 * Created by den on 2017-01-14.
 */
public class SkyTeam implements GroupTeam{
    @Override
    public Builder getBuilder() {
        return new ScrapperBuilder();
    }

    @Override
    public Supplier getSupplier() {
        return new ScrapperSupplier();
    }

    @Override
    public Ingineer getIngineer() {
        return new ScrapperIngineer();
    }
}
