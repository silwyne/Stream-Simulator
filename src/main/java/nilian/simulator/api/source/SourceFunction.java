package nilian.simulator.api.source;

import nilian.simulator.api.common.Function;

public interface SourceFunction<TYPE> extends Function {

    TYPE apply() throws Exception;

}