package calculator5_old;

import java.util.ArrayDeque;

public interface Operation_old {
    public ArrayDeque<Integer> memory = null;

    void addOperand(int operand);

    int getResult();

    boolean isCompleted();

    Integer popInt();
}
