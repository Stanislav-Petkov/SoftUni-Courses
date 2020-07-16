package com.github.slavipetkov;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FooTest {

    @Test
    public void testAddTwoNumbers() {
        //ARRANGE
        Foo foo = new Foo();
        //ACT
        int sum = foo.addTwoNumbers(2,2);
        //ASSERT
        Assertions.assertEquals(4,sum);
        Assertions.assertEquals(5,foo.addTwoNumbers(2,3));
    }

    @Test()
    public void throwsNPE(){
        //GIVEN
        Foo foo = new Foo();

        //WHEN
//        foo.iThrowNPE();
        foo.iDoNotThrowNPE();
        Assertions.assertThrows(NullPointerException.class,
                () -> foo.iThrowNPE());
        //THEN npe should be thrown
    }

}
/*

   //GIVEN
        Foo foo = new Foo();

        //WHEN
//        foo.iThrowNPE();
        foo.iDoNotThrowNPE();
        Assertions.assertThrows(NullPointerException.class,
                () -> foo.iThrowNPE()); iskam konkretno tozi metod da grumne s nullpointer
                i zashtototo gorniq metod gurmi a ne tozi testa ne minava
        //THEN npe should be thrown


 void iThrowNPE(){
        //throw new NullPointerException("NPE Messages");
    }
     void iDoNotThrowNPE(){
         throw new NullPointerException("NPE Messages");
         //System.out.println("not throwing npe");
    }


//////////////


    @Test(expected = NullPointerException.class)
    public void throwsNPE(){
        //GIVEN
        Foo foo = new Foo();

        //WHEN
        foo.iThrowNPE();;

        //THEN npe should be thrown
    }

    public void iThrowNPE(){
        throw new NullPointerException("NPE Messages");
    }




    @Test
    public void testAddTwoNumbers() {
        //ARRANGE
        Foo foo = new Foo();
        //ACT
        int sum = foo.addTwoNumbers(5,37);
        //ASSERT
        Assert.assertEquals(42,sum);
    }



kato napisha @Test
maven znae che vsichko pod test.java direktoriqta e test
mvn test buildva testa
 */