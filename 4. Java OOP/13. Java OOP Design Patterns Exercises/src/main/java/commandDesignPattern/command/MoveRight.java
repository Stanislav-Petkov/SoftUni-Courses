package commandDesignPattern.command;

import commandDesignPattern.core.Main;

public class MoveRight implements Command {
    @Override
    public void execute() {
        Main.player.increaseCol();
    }
}
