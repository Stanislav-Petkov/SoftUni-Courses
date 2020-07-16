package commandDesignPattern.command;

import commandDesignPattern.core.Main;
import static commandDesignPattern.core.Main.*;
public class MoveUp implements Command {
    @Override
    public void execute() {
        player.decreaseRow();
    }
}
