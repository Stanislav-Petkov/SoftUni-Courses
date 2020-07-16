import printableLists.AbstractBed;

public class Sofa extends AbstractBed {
    @Override
    protected String getEntityName() {
        return "Sofa";
    }

    public void printEntityName() {
        System.out.println(super.someProtectedString);
        System.out.println(this.getEntityName());
    }

    public void publicPrintEntityName() {
        System.out.println(this.getEntityName());
    }
}
