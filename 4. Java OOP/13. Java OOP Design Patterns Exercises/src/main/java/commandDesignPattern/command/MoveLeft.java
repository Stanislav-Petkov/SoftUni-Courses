package commandDesignPattern.command;

import commandDesignPattern.core.Main;

public class MoveLeft implements Command{
    @Override
    public void execute() {
        Main.player.decreaseCol();
    }
}
