package nilian.simulator.api.Unit;

import nilian.simulator.api.Unit.properties.CyclePolicy;

public class UnitBuilder {

    CyclePolicy cyclePolicy;

    UnitBuilder() {}

    public UnitBuilder setCyclePolicy(CyclePolicy cyclePolicy) {
        this.cyclePolicy = cyclePolicy;
        return this;
    }

    public Unit build() {
        return new Unit(this.cyclePolicy);
    }
}