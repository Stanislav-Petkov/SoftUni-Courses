package randomArrayList4;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList<String> {

    Random random;

    RandomArrayList(Random random) {
        this.random = random;
    }

    public String getRandomElement() {
        int rnd = random.nextInt(this.size());
        return this.get(rnd);
    }
}
