package Example_AbstractFactory_2.Living_House_Project;

import Example_AbstractFactory_2.Builder;
import Example_AbstractFactory_2.GroupTeam;
import Example_AbstractFactory_2.Ingineer;
import Example_AbstractFactory_2.Supplier;

/**
 * Created by den on 2017-01-14.
 */
public class BuildLivingHouse {
    public static void main(String[] args) {
        GroupTeam groupTeam = new CreateLivingHouseTeam();
        Supplier livingHouseSupplier = groupTeam.getSupplier();
        Builder livingHouseBuilder = groupTeam.getBuilder();
        Ingineer livingHouseIngeneer = groupTeam.getIngineer();

        livingHouseSupplier.SupplyBuilding();
        livingHouseBuilder.BuildHouse();
        livingHouseIngeneer.LeadBuilding();
    }
}
