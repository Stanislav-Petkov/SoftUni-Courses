package commandDesignPattern.command;

import java.util.Map;

public class CommandInterpreter implements CommandListener {
    private Map<String, Command> commands
            = Map.of("W",new MoveUp(),
            "S",new MoveDown(),
            "A",new MoveLeft(),
            "D", new MoveRight(),
            "AS",new MoveLeftDown(),
            "F",new Fire());

    @Override
    public void handleCommand(String type) {
        //returns command which should be executed
        Command command = commands.get(type.toUpperCase());
        if(command == null){
            //there is no such command
            throw new IllegalArgumentException("Invalid command type");
        }
        command.execute();
    }
}
