package builderDesignPattern.command;

import static commandDesignPattern.core.Main.player;

public class MoveUp implements Command {
    @Override
    public void execute() {
        player.decreaseRow();
    }
}
