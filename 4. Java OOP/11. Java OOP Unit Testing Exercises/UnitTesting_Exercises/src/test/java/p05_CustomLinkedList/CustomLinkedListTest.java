package p05_CustomLinkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomLinkedListTest {


    @Test(expected = IllegalArgumentException.class)
    public void testGetFromIndexBiggerThanCount() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("B");
        list.get(3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFromIndexLowerThanCount() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("B");
        list.get(-1);
    }

    @Test
    public void testGetFromValidIndexReturnCorrectValue() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals("B", list.get(1));
    }

    //set
    @Test(expected = IllegalArgumentException.class)
    public void testSetAtIndexBiggerThanCount() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("B");
        list.set(3, "D");
    }

    //set
    @Test(expected = IllegalArgumentException.class)
    public void testSetAtIndexLowerThanCount() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("B");
        list.set(-1, "D");
    }

    //add
    @Test
    public void testAddInEmptyList() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("A");
        assertEquals("A", list.get(0));
    }

    //add
    @Test
    public void testAddInNonEmptyList() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.set(2, list.get(2));
    }

    //remove
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAtIndexBiggerThanCount() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.removeAt(3);
    }

    //remove
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAtIndexLowerThanCount() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.removeAt(-1);
    }

    //removeAt
    @Test
    public void testRemoveAtFromValidIndex() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals("B", list.removeAt(1));
    }

    //remove
    @Test
    public void testRemoveElementAndReturnsValidIndex() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals(0, list.remove("A"));
    }

    //remove
    @Test
    public void testRemoveInvalidElementAndReturnsMinusOne() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals(-1, list.remove("D"));
    }

    //indexOf
    @Test
    public void testReturnsIndexOfContainedElement() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals(1, list.indexOf("B"));
    }

    //indexOf
    @Test
    public void testReturnsMinusOneIndexOfNotContainedElement() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals(-1, list.indexOf("D"));
    }

    //contains
    @Test
    public void testReturnsTrueIfElementIsContained() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        assertTrue(list.contains("B"));
    }

    //contains
    @Test
    public void testReturnsFalseIfElementIsNotContained() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        assertFalse(list.contains("D"));
    }
}