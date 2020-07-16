package blueOrigin;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class SpaceshipTests {
    @Test(expected = NullPointerException.class)
    public void testSetName(){
        new Spaceship("",1);
    }

    @Test(expected = NullPointerException.class)
    public void testSetNameTwo(){
        new Spaceship(null,1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCapacity(){
        new Spaceship("Ship",-1);
    }

    @Test
    public void testAddAstronaut(){
        Spaceship ship = new Spaceship("Ship",10);
        ship.add(new Astronaut("name",100));
        assertEquals(1,ship.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAstronautShouldThrow(){
        Spaceship ship = new Spaceship("Ship",1);
        ship.add(new Astronaut("name",100));
        ship.add(new Astronaut("name_two",100));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAstronautShouldThrowAlreadyAdded(){
        Spaceship ship = new Spaceship("Ship",10);
        ship.add(new Astronaut("name",100));
        ship.add(new Astronaut("name",100));
    }

    @Test
    public void testRemoveShouldReturnTrue(){
        Spaceship spaceship = new Spaceship("Ship",10);
        spaceship.add(new Astronaut("name",100));
        assertTrue(spaceship.remove("name"));
    }

    @Test
    public void testRemoveShouldReturnFalse(){
        Spaceship spaceship = new Spaceship("Ship",10);
        spaceship.add(new Astronaut("name",100));
        assertFalse(spaceship.remove("invalid"));
    }
}

/*
package blueOrigin;

import org.junit.Assert;
import org.junit.Test;


public class SpaceshipTests {
    private static final String INVALID_SPACESHIP_NAME = "Invalid spaceship name!";
    private static final String INVALID_CAPACITY = "Invalid capacity!";
    private static final String SPACESHIP_FULL = "Spaceship is full!";
    private static final String ASTRONAUT_EXIST = "Astronaut %s is already in!";
    private static final int ZERO_CAPACITY = 0;

    @Test
    public void TestCreationAndCapacity() {
        Spaceship spaceship = new Spaceship("NAME", 5);
        Assert.assertEquals(5, spaceship.getCapacity());
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestCreationIllegalCapacity() {
        Spaceship spaceship = new Spaceship("NAME", -5);
    }

    @Test
    public void testGetCount() {
        Spaceship spaceship = new Spaceship("NAME", 5);
        Assert.assertEquals(0, spaceship.getCount());
    }

    @Test
    public void testGetName() {
        Spaceship spaceship = new Spaceship("NAME", 5);
        Assert.assertEquals("NAME", spaceship.getName());
    }

    @Test(expected = NullPointerException.class)
    public void testSetIllegalName() {
        Spaceship spaceship = new Spaceship("", 1);
    }

    @Test(expected = NullPointerException.class)
    public void testSetIllegalNullName() {
        Spaceship spaceship = new Spaceship(null, 1);
    }


    @Test
    public void testRemoveNotValidName() {
        Spaceship spaceship = new Spaceship("NAME", 5);
        spaceship.add(new Astronaut("NAME1", 11.0));
        spaceship.add(new Astronaut("NAME2", 11.0));
        spaceship.add(new Astronaut("NAME3", 11.0));

        Assert.assertFalse(spaceship.remove("NAME33"));
    }

    @Test
    public void testRemoveNotValidName1() {
        Spaceship spaceship = new Spaceship("NAME", 5);
        spaceship.add(new Astronaut("NAME1", 11.0));
        spaceship.add(new Astronaut("NAME2", 11.0));
        spaceship.add(new Astronaut("NAME3", 11.0));

        Assert.assertTrue(spaceship.remove("NAME3"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMoreThanCapacityException() {
        Spaceship spaceship = new Spaceship("NAME", 5);
        spaceship.add(new Astronaut("NAME1", 11.0));
        spaceship.add(new Astronaut("NAME2", 11.0));
        spaceship.add(new Astronaut("NAME3", 11.0));
        spaceship.add(new Astronaut("NAME4", 11.0));
        spaceship.add(new Astronaut("NAME5", 11.0));
        spaceship.add(new Astronaut("NAME6", 11.0));
    }

    @Test
    public void testAddNoException() {
        Spaceship spaceship = new Spaceship("NAME", 5);
        spaceship.add(new Astronaut("NAME1", 11.0));
        spaceship.add(new Astronaut("NAME2", 11.0));
        spaceship.add(new Astronaut("NAME3", 11.0));
        spaceship.add(new Astronaut("NAME4", 11.0));
        Assert.assertEquals(4, spaceship.getCount());
    }

    @Test
    public void testAddTrue() {
        Spaceship spaceship = new Spaceship("NAME", 5);
        spaceship.add(new Astronaut("NAME1", 11.0));
        spaceship.add(new Astronaut("NAME2", 11.0));
        spaceship.add(new Astronaut("NAME3", 11.0));
        spaceship.add(new Astronaut("NAME4", 11.0));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddExistingAstronaut1() {
        Spaceship spaceship = new Spaceship("NAME", 5);
        spaceship.add(new Astronaut("NAME1", 11.0));
        spaceship.add(new Astronaut("NAME2", 11.0));
        spaceship.add(new Astronaut("NAME3", 11.0));
        spaceship.add(new Astronaut("NAME3", 11.0));
    }


    @Test
    public void testRemove() {
        Spaceship spaceship = new Spaceship("NAME", 5);
        spaceship.add(new Astronaut("NAME1", 11.0));
        spaceship.add(new Astronaut("NAME2", 11.0));
        spaceship.add(new Astronaut("NAME3", 11.0));
        spaceship.remove("NAME3");
        Assert.assertEquals(2, spaceship.getCount());
    }

    @Test
    public void testRemoveFalse() {
        Spaceship spaceship = new Spaceship("NAME", 5);
        spaceship.add(new Astronaut("NAME1", 11.0));
        spaceship.add(new Astronaut("NAME2", 11.0));
        spaceship.add(new Astronaut("NAME3", 11.0));
        Assert.assertFalse(spaceship.remove("NAME33"));
    }

    @Test
    public void testRemoveTrue() {
        Spaceship spaceship = new Spaceship("NAME", 5);
        spaceship.add(new Astronaut("NAME1", 11.0));
        spaceship.add(new Astronaut("NAME2", 11.0));
        spaceship.add(new Astronaut("NAME3", 11.0));
        Assert.assertTrue(spaceship.remove("NAME3"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCapacityException() {
        Spaceship spaceship = new Spaceship("NAME", -1);
    }


}

 */