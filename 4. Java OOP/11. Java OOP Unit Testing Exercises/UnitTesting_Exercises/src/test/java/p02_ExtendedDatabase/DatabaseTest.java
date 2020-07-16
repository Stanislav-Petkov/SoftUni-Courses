package p02_ExtendedDatabase;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.assertEquals;

public class DatabaseTest {

    private Database database;
    private static final Person[] EXPECTED = {
            new Person(1, "First"),
            new Person(2, "Second"),
            new Person(3, "Third"),
            new Person(4, "Fourth")
    };

    @Before
    public void setUp() throws OperationNotSupportedException {
        Person p1 = new Person(1, "First");
        Person p2 = new Person(2, "Second");
        Person p3 = new Person(3, "Third");
        Person p4 = new Person(4, "Fourth");
        database = new Database(p1, p2, p3, p4);
    }

    @Test
    public void testDatabaseConstructorShouldCreateObjectWithValidState() {
        Person[] elements = database.getElements();
        assertEquals(EXPECTED.length, elements.length);
        for (int i = 0; i < EXPECTED.length; i++) {
            assertEquals(EXPECTED[i], elements[i]);
        }
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testDatabaseConstructorShouldThrowWhenCalledWithMoreThanSixteenElements() throws OperationNotSupportedException {
        Person[] arr = new Person[17];
        new Database(arr);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testDatabaseConstructorShouldThrowWhenCalledWithLessThanOneElement() throws OperationNotSupportedException {
        Person[] arr = new Person[0];
        Database database = new Database(arr);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testsAddShouldThrowWhenParameterIsNull() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void testAddShouldAddAtFirstFreeIndex() throws OperationNotSupportedException {
        Person fifth = new Person(5, "Fifth");
        database.add(fifth);
        Person[] elements = database.getElements();
        assertEquals(5, elements.length);
        assertEquals(fifth, elements[4]);
    }

    @Test
    public void testShouldRemoveLastElement() throws OperationNotSupportedException {
        database.remove();
        Person[] actual = database.getElements();
        Person[] expected = {
                new Person(1, "First"),
                new Person(2, "Second"),
                new Person(3, "Third"),
        };
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
        Person[] actual = database.getElements();
        for (int i = 0; i < EXPECTED.length; i++) {
            assertEquals(EXPECTED[i], actual[i]);
        }
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddDuplicatePersonShouldThrow() throws OperationNotSupportedException {
        this.database.add(new Person(1, "First"));
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddPersonWithNegativeIdShouldThrow() throws OperationNotSupportedException {
        this.database.add(new Person(-1, "MinusOne"));
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameShouldThrowWithNullParameter() throws OperationNotSupportedException {
        this.database.findByUsername(null);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameShouldThrowWhenInvalidUsernameIsGiven() throws OperationNotSupportedException {
        this.database.findByUsername("Not_Present_user");
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameShouldThrowWhenMoreThanOnePersonHasTheSameUsername() throws OperationNotSupportedException {
        Person p1 = new Person(1, "First");
        Person p2 = new Person(2, "Second");
        Person p3 = new Person(3, "Fourth");
        Person p4 = new Person(4, "Fourth");
        Database database = new Database(p1, p2, p3, p4);
        database.findByUsername("Fourth");
    }

    @Test
    public void testFindByUsernameShouldReturnCorrectPerson() throws OperationNotSupportedException {
        Person actual = this.database.findByUsername("First");
        Person needed = new Person(1, "First");
        assertEquals(actual, needed);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByIdShouldThrowWithIdNotPresent() throws OperationNotSupportedException {
        this.database.findById(7L);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByIdShouldThrowWithMultiplePeopleWithSameId() throws OperationNotSupportedException {
        Person p1 = new Person(1, "First");
        Person p2 = new Person(2, "Second");
        Person p3 = new Person(3, "Fourth");
        Person p4 = new Person(3, "Fourth");
        Database database = new Database(p1, p2, p3, p4);
        database.findById(3);
    }

    @Test
    public void testFindByIdShouldReturnCorrectPerson() throws OperationNotSupportedException {
        Person byId = this.database.findById(1);
        assertEquals(byId, new Person(1, "First"));
        assertEquals(1, byId.getId());
        assertEquals("First", byId.getUsername());
    }
}
