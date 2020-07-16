package calculator5_old;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationOperation_old implements Operation_old {
    private List<Integer> operands;
    private int result;

    public MultiplicationOperation_old() {
        this.operands = new ArrayList<>();
    }

    @Override
    public void addOperand(int operand) {
        this.operands.add(operand);

        if (this.isCompleted()) {
            this.result = this.operands.get(0) * this.operands.get(1);
        }
    }

    @Override
    public boolean isCompleted() {
        return this.operands.size() == 2;
    }

    @Override
    public Integer popInt() {
        return null;
    }

    @Override
    public int getResult() {
        return this.result;
    }
}
