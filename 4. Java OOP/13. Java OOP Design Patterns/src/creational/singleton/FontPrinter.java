package creational.singleton;

public class FontPrinter {

    private MyProperties props;

    public FontPrinter(MyProperties myProperties) {
        props = myProperties;
    }

    public String returnFont() {
        return props.getProperty("font");
    }
}
