package strategyDesignPattern.command;

import strategyDesignPattern.builder.MapBuilder;
import strategyDesignPattern.builder.MyMapBuilder;
import strategyDesignPattern.stone.ThrowFast;
import strategyDesignPattern.stone.ThrowSlow;

import java.util.Map;

public class CommandInterpreter implements CommandListener {
    private Map<String, Command> commands;
//            = Map.of("W",new MoveUp(),
//            "S",new MoveDown(),
//            "A",new MoveLeft(),
//            "D", new MoveRight(),
//            "AS",new MoveLeftDown(),
//            "F",new Fire());

    public CommandInterpreter(){
        MapBuilder<String, Command> builder = new MyMapBuilder<>();
        this.commands = builder
                .entry("W", new MoveUp())
                .entry("S",new MoveDown())
                .entry("A",new MoveLeft())
                .entry("D", new MoveRight())
                .entry("AS",new MoveLeftDown())
                .entry("FS",new Fire(new ThrowFast()))
                .entry("F",new Fire(new ThrowSlow()))
                .build();
    }
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
