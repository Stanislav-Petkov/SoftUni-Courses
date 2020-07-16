package calculator5_old;

public class CalculationEngine_old {
    private int result;
    private Operation_old currentOperation;

    public CalculationEngine_old() {
        this.result = 0;
        this.currentOperation = null;
    }

    public void pushNumber(int number) {
        if (this.currentOperation != null) {
            currentOperation.addOperand(number);
            if (currentOperation.isCompleted()) {
                this.result = currentOperation.getResult();
                this.currentOperation = null;
            }
        } else {
            this.result = number;
        }
    }

    void pushOperation(Operation_old operation) {
        if (operation.isCompleted()) {
            this.pushNumber(operation.getResult());
        } else {
            operation.popInt();
            this.currentOperation = operation;
            this.pushNumber(this.result);
        }
    }
    int getCurrentResult() {
        return this.result;
    }
}
