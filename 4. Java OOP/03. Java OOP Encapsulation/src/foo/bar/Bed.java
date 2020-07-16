package foo.bar;

public class Bed implements Deceyable {
    protected String mattressMaterial;

    public Bed(String mattressMaterial) {
        this.mattressMaterial = mattressMaterial;
    }

    @Override
    public void decay() {
        System.out.println("Bed is dacaying...");
    }

    public String getMattressMaterial() {
        return this.mattressMaterial;
    }
}
