package Example_AbstractFactory_2;

/**
 * Created by den on 2017-01-14.
 */
public interface GroupTeam {
    Builder getBuilder();
    Supplier getSupplier();
    Ingineer getIngineer();
}
