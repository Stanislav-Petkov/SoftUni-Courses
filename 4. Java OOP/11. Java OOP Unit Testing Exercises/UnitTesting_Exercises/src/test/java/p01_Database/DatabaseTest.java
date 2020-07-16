package p01_Database;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.assertEquals;

public class DatabaseTest {

    private Database database;
    private static final Integer[] EXPECTED = {13, 42, 69, 73};


    @Before
    public void setUp() throws OperationNotSupportedException {
        database = new Database(13, 42, 69, 73);
    }

    @Test
    public void testDatabaseConstructorShouldCreateObjectWithValidState() {

        Integer[] elements = database.getElements();
        //assertEquals(expected.length,elements.length);
        for (int i = 0; i < EXPECTED.length; i++) {
            assertEquals(EXPECTED[i], elements[i]);
        }
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testDatabaseConstructorShouldThrowWhenCalledWithMoreThanSixteenElements() throws OperationNotSupportedException {
        Integer[] arr = new Integer[17];
        new Database(arr);

    }

    @Test(expected = OperationNotSupportedException.class)
    public void testDatabaseConstructorShouldThrowWhenCalledWithLessThanOneElement() throws OperationNotSupportedException {
        Integer[] arr = new Integer[0];
        Database database = new Database(arr);

    }

    @Test(expected = OperationNotSupportedException.class)
    public void testsAddShouldThrowWhenParameterIsNull() throws OperationNotSupportedException {

        database.add(null);
    }

    @Test
    public void testAddShouldAddAtFirstFreeIndex() throws OperationNotSupportedException {

        database.add(666);
        Integer[] elements = database.getElements();
        assertEquals(5, elements.length);
        assertEquals(Integer.valueOf(666), elements[4]);

    }

    @Test
    public void testShouldRemoveLastElement() throws OperationNotSupportedException {

        database.remove();
        Integer[] actual = database.getElements();
        Integer[] expected = {13, 42, 69};
        assertEquals(actual.length, expected.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(actual[i], expected[i]);
        }
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveShouldThrowWhenRemoveFromEmptyDatabase() throws OperationNotSupportedException {
        for (int i = 0; i < 4; i++) {
            database.remove();
        }
        database.remove();
    }

    @Test
    public void testGetElementsShouldReturnCorrectArrays() {
        Integer[] actual = database.getElements();
        for (int i = 0; i < EXPECTED.length; i++) {
            assertEquals(EXPECTED[i], actual[i]);
        }
    }
}
