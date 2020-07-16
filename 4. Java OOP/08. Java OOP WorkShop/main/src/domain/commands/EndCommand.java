package domain.commands;

public class EndCommand implements Command{

    @Override
    public void execute(){ //ne ispolzva input
        System.exit(0);
    }
}
