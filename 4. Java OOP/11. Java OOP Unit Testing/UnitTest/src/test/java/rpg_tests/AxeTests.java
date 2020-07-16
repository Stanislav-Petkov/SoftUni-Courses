package rpg_tests;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class AxeTests {
    @Test
    public void weapon_attack_losses_durability() {
        //GIVEN
        Axe axe = new Axe(42, 3);
        Dummy dummy = new Dummy(1, 1);
        //WHEN
        axe.attack(dummy);
        //tHEN
        Assert.assertEquals(2, axe.getDurabilityPoints());
    }

    @Test
    public void weapon_attack_damages_target() {
        //GIVEN
        Axe axe = new Axe(5, 3);
        Dummy dummy = new Dummy(7, 1);
        //WHEN
        axe.attack(dummy);
        //tHEN
        Assert.assertEquals(2, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void broken_weapon_cannot_attack() {
        //GIVEN
        Axe axe = new Axe(42, 0);
        Dummy dummy = new Dummy(1, 1);
        //WHEN
        axe.attack(dummy);
        //THEN exception should be thrown
    }

    @Test
    public void dont_do_this() {
        //GIVEN
        Durable mockedDurable = Mockito.mock(Durable.class);
        Mockito.when(mockedDurable.getDurabilityPoints()).thenReturn(3);
        Assert.assertEquals(3, mockedDurable.getDurabilityPoints());
    }
}














