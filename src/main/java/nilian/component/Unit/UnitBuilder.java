package nilian.component.Unit;

import java.util.Properties;

public class UnitBuilder {

    Properties properties;

    UnitBuilder() {}

    public UnitBuilder setProperties(Properties properties) {
        this.properties = properties;
        return this;
    }

    public Unit build() {
        return new Unit(this.properties);
    }
}