package entities.shampoo;

import java.math.BigDecimal;

public class AmmoniumChloride extends BasicChemicalIngredient {
    private static final BigDecimal PRICE =  new BigDecimal("6.12");
    private static final String NAME = "Ammonium Chloride";
    private static final String CHEMICAL_FORMULA = "NH4Cl";

    public AmmoniumChloride(){
        super(NAME,PRICE,CHEMICAL_FORMULA);
    }

    public  BigDecimal getPRICE() {
        return PRICE;
    }

    public  String getNAME() {
        return NAME;
    }

    @Override
    public void setChemicalFormula(String chemicalFormula) {

    }

    public  String getChemicalFormula() {
        return CHEMICAL_FORMULA;
    }
}
