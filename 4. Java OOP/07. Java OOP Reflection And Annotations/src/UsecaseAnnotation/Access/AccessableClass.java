package UsecaseAnnotation.Access;

public class AccessableClass {

    @Access(resource = Resource.FILE, accessLevel = AccessLevel.READ)
    public void foo() {
    }

    //@Access(resource = Resource.FILE, accessLevel = AccessLevel.WRITE)
    private String createFoo() {
        return "";
    }
}
