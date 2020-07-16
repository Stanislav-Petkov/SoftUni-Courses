public class SoftuniRobot {

    public static int version = 4;
    String name;
    String serialNum;
    private int power;

    public static void printSomeStuff() {
        System.out.println(version);
    }

    public SoftuniRobot(String name, String serialNum, int power) {
        this.name = name;
        this.serialNum = serialNum;
        this.power = power + version;
        if (power < 0) {
            this.power = 0;
        }
    }

    public static void setVersion(int newVersion) {
        version = newVersion;
    }

    public static int getVersion() {
        return SoftuniRobot.version;
    }

    public SoftuniRobot(String name, int power) {
        this.name = name;
        this.power = power + version;
    }

    public SoftuniRobot() {
        this(null, "gg", 1);

    }

    @Override
    public String toString() {
        return "SoftuniRobot{" +
                "name='" + name + '\'' +
                ", serialNum='" + serialNum + '\'' +
                ", power=" + power +
                '}';
    }

    public void setPower(int newPower) {
        if (newPower < 0) {
            return;
        }
        this.power = newPower;
    }

    public int getPower() {
        return this.power;
    }
}

