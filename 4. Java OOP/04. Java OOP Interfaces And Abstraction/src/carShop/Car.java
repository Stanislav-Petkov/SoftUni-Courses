package carShop;

public interface Car {
    public static final int TIRES = 4;
    String getModel();
     String getColor();
     Integer getHorsePower();
     String countryProduced();
     default int getTires(){
         return TIRES;
     }
}
