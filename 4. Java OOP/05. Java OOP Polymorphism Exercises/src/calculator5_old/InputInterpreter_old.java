package calculator5_old;

public class InputInterpreter_old {
    private CalculationEngine_old engine;

    public InputInterpreter_old(CalculationEngine_old engine) {
        this.engine = engine;
    }

    public boolean interpret(String input) {
        try {
            engine.pushNumber(Integer.parseInt(input));
        } catch (Exception ex) {
            engine.pushOperation(this.getOperation(input));
        }
        return true;
    }

    public Operation_old getOperation(String operation) {
        if (operation.equals("*")) {
            return new MultiplicationOperation_old();
        }
        if (operation.equals("/")) {
            return new DivisionOperation_old();
        }
        if (operation.equals("ms")) {
            return new SaveToMemory_old();
        }
        if (operation.equals("mr")) {
            return new GetFromMemory_old();
        }
        return null;
    }
}
