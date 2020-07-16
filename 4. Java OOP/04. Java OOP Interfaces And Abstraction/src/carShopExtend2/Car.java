package carShopExtend2;

public interface Car {
    int TIRES = 4;
    static int foo(){
     return 42;
    }
    String getModel();
     String getColor();
     Integer getHorsePower();
     String countryProduced();
     default String frontBumper(){
      return "Car frontBumper ";
     }
}
