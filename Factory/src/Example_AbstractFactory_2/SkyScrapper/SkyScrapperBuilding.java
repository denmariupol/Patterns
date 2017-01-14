package Example_AbstractFactory_2.SkyScrapper;

import Example_AbstractFactory_2.Builder;
import Example_AbstractFactory_2.GroupTeam;
import Example_AbstractFactory_2.Ingineer;
import Example_AbstractFactory_2.Supplier;

/**
 * Created by den on 2017-01-14.
 */
public class SkyScrapperBuilding {
    public static void main(String[] args) {
        GroupTeam skyscrapperTeam = new SkyTeam();
        Supplier scrapperSupplier = skyscrapperTeam.getSupplier();
        Builder scrapperbuilder = skyscrapperTeam.getBuilder();
        Ingineer scrapperIngineer = skyscrapperTeam.getIngineer();

        scrapperSupplier.SupplyBuilding();
        scrapperbuilder.BuildHouse();
        scrapperIngineer.LeadBuilding();
    }


}
