package nilian.component.Unit;

import java.util.Properties;

public class Unit {

    Properties properties;

    Unit(Properties properties) {
        this.properties = properties;
    }

    public static UnitBuilder newBuilder() {
        return new UnitBuilder();
    }
}