package controllers;

import interfaces.Layout;
import interfaces.LayoutFactory;

public class LayoutWorkShop implements LayoutFactory {
    @Override
    public Layout produce(String type) {
        return switch (type) {
            case "SimpleLayout" -> new SimpleLayout();
            case "XmlLayout" -> new XmlLayout();
            default -> throw new IllegalStateException(
                    "Not valid type of layout for " + type + " param");
        };
    }
}
