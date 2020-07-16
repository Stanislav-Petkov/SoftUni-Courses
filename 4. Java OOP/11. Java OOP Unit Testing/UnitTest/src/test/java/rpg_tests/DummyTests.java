package rpg_tests;

import org.junit.Assert;
import org.junit.Test;

public class DummyTests {
    private static final int DUMMY_HEALTH = 1;
//
//    	Dummy loses health if attacked
//     	Dead Dummy throws exception if attacked
//  	Dead Dummy can give XP
//  	Alive Dummy can't give XP

    @Test
    public void dummy_loses_health_if_attacked() {
        //GIVEN
        Dummy dummy = new Dummy(10, 1);
        //WHEN
        dummy.takeAttack(7);
        //THEN
        Assert.assertEquals(3, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void dead_dummy_throws_exception_if_attacked() {
        //GIVEN
        Dummy dummy = new Dummy(0, 5);
        //WHEN
        dummy.takeAttack(5);
        //THEN
    }

    @Test
    public void dead_dummy_can_give_xp() {
        //GIVEN
        Dummy dummy = new Dummy(0, 2);
        //WHEN
        int xp = dummy.giveExperience();
        //THEN
        Assert.assertEquals("A dummy setup with N xp, when killed should give N xp",
                2, xp);
    }

    @Test(expected = IllegalStateException.class)
    public void alive_dummy_cannot_give_xp() {
        //GIVEN
        Dummy aliveDummy = new Dummy(1, 1);
        //WHEN
        aliveDummy.giveExperience();
        //THEN exception should be thrown
    }
}