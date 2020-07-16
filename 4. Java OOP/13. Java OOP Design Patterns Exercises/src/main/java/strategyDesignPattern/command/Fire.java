package strategyDesignPattern.command;

import strategyDesignPattern.core.Main;
import strategyDesignPattern.stone.Throw;

public class Fire implements Command {
    private Throw th;

    public Fire(Throw th){
        this.th = th;
    }

    public Fire(){}

    @Override
    public void execute() {
        Main.player.throwStone(this.th);
    }
}
