package aquarium;

import org.junit.Test;

import static org.junit.Assert.*;

public class AquariumTests {
    //TODO: TEST ALL THE FUNCTIONALITY OF THE PROVIDED CLASS Aquarium
    @Test
    public void testCorrectNameAndCapacity() {
        Aquarium aquarium = new Aquarium("aqua", 10);
    }

    @Test(expected = NullPointerException.class)
    public void testEmptyInvalidName() {
        Aquarium aquarium = new Aquarium("", 10);
    }

    @Test(expected = NullPointerException.class)
    public void testNullInvalidName() {
        Aquarium aquarium = new Aquarium(null, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCapacity() {
        Aquarium aquarium = new Aquarium("null", -10);
    }

    @Test
    public void testAdd() {
        Aquarium aquarium = new Aquarium("Aqua", 10);
        aquarium.add(new Fish("fish1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoreThanCapacityAdd() {
        Aquarium aquarium = new Aquarium("Aqua", 2);
        aquarium.add(new Fish("fish1"));
        aquarium.add(new Fish("fish1"));
        aquarium.add(new Fish("fish1"));
    }

    @Test
    public void testValidCapacityAdd() {
        Aquarium aquarium = new Aquarium("Aqua", 2);
        aquarium.add(new Fish("fish1"));
        aquarium.add(new Fish("fish1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidRemove() {
        Aquarium aquarium = new Aquarium("Aqua", 2);
        aquarium.add(new Fish("fish1"));
        aquarium.add(new Fish("fish2"));
        aquarium.remove("Fish3");
    }

    @Test
    public void testValidRemove() {
        Aquarium aquarium = new Aquarium("Aqua", 2);
        aquarium.add(new Fish("fish1"));
        aquarium.add(new Fish("fish2"));
        aquarium.remove("fish2");
    }

    @Test
    public void testValidSelfFish() {
        Aquarium aquarium = new Aquarium("Aqua", 2);
        aquarium.add(new Fish("fish1"));
        aquarium.add(new Fish("fish2"));
        Fish fish2 = aquarium.sellFish("fish2");
        assertEquals(fish2, aquarium.sellFish("fish2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidSelfFish() {
        Aquarium aquarium = new Aquarium("Aqua", 2);
        aquarium.add(new Fish("fish1"));
        aquarium.add(new Fish("fish2"));
        Fish fish2 = aquarium.sellFish("fish23");
    }

    @Test
    public void testValidSelfFishIsAvailable() {
        Aquarium aquarium = new Aquarium("Aqua", 2);
        aquarium.add(new Fish("fish1"));
        aquarium.add(new Fish("fish2"));
        Fish fish2 = aquarium.sellFish("fish2");
        assertEquals(fish2, aquarium.sellFish("fish2"));
        assertFalse(fish2.isAvailable());
    }

    @Test
    public void testReport() {
        Fish f = new Fish("name");
        Fish f1 = new Fish("name1");
        Fish f2 = new Fish("name2");
        Aquarium aquarium = new Aquarium("aqua", 10);

        aquarium.add(f);
        aquarium.add(f1);
        aquarium.add(f2);
        aquarium.remove("name2");
        assertEquals("Fish available at aqua: name, name1", aquarium.report());
    }
}

