package strategyDesignPattern.command;

import strategyDesignPattern.core.Main;

public class MoveRight implements Command {
    @Override
    public void execute() {
        Main.player.increaseCol();
    }
}
