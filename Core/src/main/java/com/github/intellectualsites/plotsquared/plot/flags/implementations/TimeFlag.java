package com.github.intellectualsites.plotsquared.plot.flags.implementations;

import com.github.intellectualsites.plotsquared.plot.config.Captions;
import com.github.intellectualsites.plotsquared.plot.flags.types.LongFlag;
import org.jetbrains.annotations.NotNull;

public class TimeFlag extends LongFlag<TimeFlag> {
    public static final TimeFlag TIME_DISABLED = new TimeFlag(Long.MIN_VALUE);

    protected TimeFlag(@NotNull Long value) {
        super(value, Captions.FLAG_DESCRIPTION_TIME);
    }

    @Override protected TimeFlag flagOf(@NotNull Long value) {
        return new TimeFlag(value);
    }
}
