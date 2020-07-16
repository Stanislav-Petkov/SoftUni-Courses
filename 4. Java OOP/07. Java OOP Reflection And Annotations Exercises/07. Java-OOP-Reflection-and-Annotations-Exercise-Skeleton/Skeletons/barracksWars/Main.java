package barracksWars;

import barracksWars.core.CommandInterpreterImpl;
import barracksWars.core.Engine;
import barracksWars.core.factories.UnitFactoryImpl;
import barracksWars.data.UnitRepository;
import barracksWars.interfaces.Repository;
import barracksWars.interfaces.Runnable;
import barracksWars.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) {
        UnitFactory unitFactory = new UnitFactoryImpl();
        Repository repository = new UnitRepository();
        Runnable engine = new Engine(new CommandInterpreterImpl(unitFactory, repository));
        engine.run();
    }
}
