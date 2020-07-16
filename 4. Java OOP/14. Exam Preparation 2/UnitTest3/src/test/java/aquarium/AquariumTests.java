package aquarium;

import org.junit.Test;

import static org.junit.Assert.*;

public class AquariumTests {
    @Test
    public void constructorShouldCreateValidInstance() {
        Aquarium aquarium = new Aquarium("Word", 5);
        String expectedName = "Word";
        int expectedCapacity = 5;
        String actualName = aquarium.getName();
        int actualCapacity = aquarium.getCapacity();
        assertEquals(expectedName, actualName);
        assertEquals(expectedCapacity, actualCapacity);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldCreateInValidInstance() {
        Aquarium aquarium = new Aquarium("Word", -5);
    }

    @Test
    public void fishConstructorShouldCreateValidFish() {
        Fish fish = new Fish("Nemo");
        String expectedFish = "Nemo";
        String actualFish = fish.getName();
        assertEquals(expectedFish, actualFish);
    }

    @Test
    public void validateAddMethodValid() {
        Aquarium aquarium = new Aquarium("Word", 5);
        Fish fish = new Fish("Nemo");
        aquarium.add(fish);
        int expectedSize = 1;
        int actualSize = aquarium.getCount();
        assertEquals(expectedSize, actualSize);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateAddMethodInvalid() {
        Aquarium aquarium = new Aquarium("Word", 1);
        Fish fish = new Fish("Nemo");
        Fish fish2 = new Fish("Nemo2");
        aquarium.add(fish);
        aquarium.add(fish2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateRemoveMethodInvalid() {
        Aquarium aquarium = new Aquarium("Word", 1);
        Fish fish = new Fish("Nemo");
        aquarium.add(fish);
        aquarium.remove("Nemo2");
    }

    @Test
    public void validateRemoveMethodValid() {
        Aquarium aquarium = new Aquarium("Word", 1);
        Fish fish = new Fish("Nemo");
        aquarium.add(fish);
        aquarium.remove("Nemo");
        int expectedSize = 0;
        int actualSize = aquarium.getCount();
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void validateSellFishMethodValid() {
        Aquarium aquarium = new Aquarium("Word", 2);
        Fish fish = new Fish("Nemo");
        aquarium.add(fish);
        Fish expectedFish = aquarium.sellFish("Nemo");
        assertFalse(expectedFish.isAvailable());
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateSellFishMethodInvalid() {
        Aquarium aquarium = new Aquarium("Word", 2);
        Fish fish = new Fish("Nemo");
        aquarium.add(fish);
        Fish expectedFish = aquarium.sellFish("Nemo2");
    }

    @Test
    public void testReportMethod() {
        Aquarium aquarium = new Aquarium("Word", 5);
        aquarium.add(new Fish("Nemo"));
        String actual = "Fish available at Word: Nemo";
        String expected = aquarium.report();
        assertEquals(actual, expected);
    }
}
