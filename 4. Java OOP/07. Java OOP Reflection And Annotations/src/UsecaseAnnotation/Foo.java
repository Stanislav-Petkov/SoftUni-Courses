package UsecaseAnnotation;

import DeprecatedAnnotation.Test;

public class Foo {


    private String t;
    @Test("I have a very special name!")
    public void foo(){
        System.out.println("testing foo");
    }

    @Test(value = "some other name")
    public void bar(){
        System.out.println("testing bar");
    }

    @Test
    public void zar(){
        System.out.println("testing zar");
    }
}

/*

package DeprecatedAnnotation;

public class Foo {


    private String t;
    @Test
    public void testFoo(){
        System.out.println("testing foo");
    }

    @Test
    @Deprecated(since = "3.3",forRemoval = true)
    public void testBar(){
        System.out.println("testing bar");
    }

    @Test
    public void testZar(){
        System.out.println("testing zar");
    }
}


 */