package aquarium.models.fish;

public class FreshwaterFish extends BaseFish {

    //Can only live in FreshwaterAquarium!
    private static final int INITIAL_SIZE = 3;
    private static final int INCREASES = 3;

    public FreshwaterFish(String name, String species, double price) {
        super(name, species, price);
        this.setSize(INITIAL_SIZE);
    }

    @Override
    public void eat() {
        int oldSize = super.getSize();
        super.setSize(oldSize + INCREASES);
    }
}
