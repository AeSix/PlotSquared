package com.github.intellectualsites.plotsquared.plot.flags.implementations;

import com.github.intellectualsites.plotsquared.plot.config.Captions;
import com.github.intellectualsites.plotsquared.plot.flags.types.BooleanFlag;
import org.jetbrains.annotations.NotNull;

public class PveFlag extends BooleanFlag<PveFlag> {

    public static final PveFlag PVE_TRUE = new PveFlag(true);
    public static final PveFlag PVE_FALSE = new PveFlag(false);

    private PveFlag(boolean value) {
        super(value, Captions.FLAG_DESCRIPTION_PVE);
    }

    @Override protected PveFlag flagOf(@NotNull Boolean value) {
        return value ? PVE_TRUE : PVE_FALSE;
    }

}
