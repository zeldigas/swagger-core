package io.swagger.oas.models;

import io.swagger.oas.annotations.media.Schema;

public abstract class JCovariantGetter {
    @Schema
    public Object getMyProperty() {
        return "42";
    }

    @Schema
    public Object getMyOtherProperty() {
        return "42";
    }

    public static class Sub extends JCovariantGetter {
        @Override
        public Integer getMyProperty() {
            return 42;
        }

        @Override
        public Integer getMyOtherProperty() {
            return 42;
        }
    }
}
