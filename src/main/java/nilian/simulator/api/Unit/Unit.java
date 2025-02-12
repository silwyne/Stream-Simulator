package nilian.simulator.api.Unit;

import nilian.simulator.api.Unit.properties.CyclePolicy;

public class Unit {

    CyclePolicy cyclePolicy;

    Unit(CyclePolicy cyclePolicy) {
        this.cyclePolicy = cyclePolicy;
    }

    public static UnitBuilder newBuilder() {
        return new UnitBuilder();
    }
}