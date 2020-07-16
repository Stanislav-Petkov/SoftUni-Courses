package calculator5_old;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SaveToMemory_old implements Operation_old {
    protected List<Integer> operands;
    protected int result;
    protected Deque<Integer> memory;

    public SaveToMemory_old() {
        this.operands = new ArrayList<>();
        this.memory = new ArrayDeque<>();
    }

    public Integer popInt() {
        return this.memory.pop();
    }

    @Override
    public void addOperand(int operand) {
        this.operands.add(operand);
        memory.push(operand);
    }

    @Override
    public boolean isCompleted() {
        return this.operands.size() == 2;
    }

    @Override
    public int getResult() {
        return this.result;
    }

}
