package sayHelloExtended4;

import sayHelloExtended4.BasePerson;

public class Bulgarian extends BasePerson {

    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }

}
