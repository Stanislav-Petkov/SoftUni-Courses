package calculator5_old;

public class Extensions_old {
    public static InputInterpreter_old buildInterpreter(CalculationEngine_old engine) {
        System.out.println();
        InputInterpreter_old inputInterpreter = new InputInterpreter_old(engine);
        return inputInterpreter;
    }
}
