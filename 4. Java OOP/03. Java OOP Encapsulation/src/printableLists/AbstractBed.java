package printableLists;

public abstract class AbstractBed {

    protected String someProtectedString = "foo";

    protected abstract String getEntityName();

    public void sleep() {
        System.out.println("I am sleeping on a " + this.getEntityName());
    }
}
