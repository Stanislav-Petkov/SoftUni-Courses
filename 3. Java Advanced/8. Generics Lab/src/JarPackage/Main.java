package JarPackage;

public class Main {
    public static void main(String[] args)  {
        Jar<String> jar = new Jar();
        jar.add("element1");
        System.out.println(jar.remove());
    }
}
