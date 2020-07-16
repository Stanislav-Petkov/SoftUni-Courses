public class ClassStructure {

    public static final String FOO = "foo";
    private static final String PRIVATE_FOO = "private foo";

    public String someString;
    private int someInt;

    public ClassStructure() {
        this("", 0);
    }

    public static void iAmStatic() {

    }

    public ClassStructure(String someString, int someInt) {
        this.someString = someString;
        this.someInt = someInt;
    }

    public void printMe() {
        System.out.println(someString + someInt);
    }

    private void privatePrintMe() {
        System.out.println(someString);
    }

    public String getSomeString() {
        return this.someString;
    }

    public int getSomeInt() {
        return someInt;
    }

    public void setSomeInt(int someInt) {
        this.someInt = someInt;
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.someString, this.someInt);
    }
    //static > not static
    //fields > constructors > methods
    //public > not public
    //getters /  setters / toString / equals / hashCode...
}








