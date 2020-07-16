import implementations.Tree;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Tree<Integer> tree1 = new Tree<>(7,
                                    new Tree<>(19,
                                            new Tree<>(1),
                                            new Tree<>(12),
                                            new Tree<>(31)),
                                    new Tree<>(21),
                                    new Tree<>(14,
                                            new Tree<>(23),
                                            new Tree<>(6)));
         tree1.swap(19,14);
        List<Integer> orderedByBfs = tree1.orderBfs();
        for (Integer integer : orderedByBfs) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
