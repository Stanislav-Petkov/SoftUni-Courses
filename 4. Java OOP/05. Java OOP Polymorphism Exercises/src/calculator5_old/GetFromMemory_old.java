package calculator5_old;

import java.util.Deque;
import java.util.List;

public class GetFromMemory_old extends SaveToMemory_old implements Operation_old {
    protected List<Integer> operands;
    protected int result;
    protected Deque<Integer> memory;

    public GetFromMemory_old() {
        this.operands = super.operands;
        this.result = super.result;
        this.memory = super.memory;
    }

    public Integer popInt() {
        return this.memory.pop();
    }

    @Override
    public boolean isCompleted() {
        return this.operands.size() == 2;
    }

    @Override
    public int getResult() {
        return this.memory.pop();
    }
}
