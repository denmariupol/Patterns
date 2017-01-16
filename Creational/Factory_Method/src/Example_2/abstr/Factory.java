package Example_2.abstr;


import Example_2.BMWFactory;
import Example_2.VolvoFactory;

/**
 * Created by den on 2017-01-14.
 */
public abstract class Factory {
    public abstract Car createCar();

     public static Factory createFactory(String factory){
          if(factory.equalsIgnoreCase("bmw"))
               return new BMWFactory();
          else if (factory.equalsIgnoreCase("volvo"))
               return new VolvoFactory();
          else
               return null;
     }
}
