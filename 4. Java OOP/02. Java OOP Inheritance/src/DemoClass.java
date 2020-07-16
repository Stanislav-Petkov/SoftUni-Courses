public class DemoClass {
    private String hi;

    public DemoClass(String hi) {
        this.hi = hi;
    }

    public void sayHello() {
        System.out.println(hi);
    }

    public static void main(String[] args) {
        DemoEnum[] allEnums = DemoEnum.values();
        DemoEnum firstEnum = allEnums[0];
        DemoEnum e = DemoEnum.J_2;
        if (e == firstEnum) {
            System.out.println("Yay they are equals");
        }
        if (e.equals(firstEnum)) {
            System.out.println("Yay they are equals");
        }
        if (DemoEnum.J_2 == e) {
            System.out.println("Yay they are equals");
        }
    }
}
