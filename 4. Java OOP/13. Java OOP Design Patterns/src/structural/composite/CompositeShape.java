package structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeShape extends AbstractShape {
    protected List<Shape> children = new ArrayList<>();

    public CompositeShape(Shape... components) {
        add(components);
    }

    public void add(Shape... components) {
        children.addAll(Arrays.asList(components));
    }

    @Override
    public void select() {
        super.select();
        for (Shape child : children) {
            child.select();
        }
    }

    @Override
    public void unSelect() {
        super.unSelect();
        for (Shape child : children) {
            child.unSelect();
        }
    }
}
