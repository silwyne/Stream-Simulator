package nilian;

import nilian.simulator.api.Unit.Unit;
import nilian.simulator.api.Unit.properties.CyclePolicy;

public class Main {

    public static void main(String[] args) {

        // making a unit
        Unit unit = Unit.newBuilder()
                .setCyclePolicy(CyclePolicy.DIE_WITH_SOURCE)
                .build();


    }
}
