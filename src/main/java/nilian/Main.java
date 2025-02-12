package nilian;

import nilian.component.Unit.Unit;

import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        // making a unit
        Unit unit = Unit.newBuilder()
                .setProperties(new Properties())
                .build();


    }
}
