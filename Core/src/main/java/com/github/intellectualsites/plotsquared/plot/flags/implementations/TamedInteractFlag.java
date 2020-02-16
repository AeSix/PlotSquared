package com.github.intellectualsites.plotsquared.plot.flags.implementations;

import com.github.intellectualsites.plotsquared.plot.config.Captions;
import com.github.intellectualsites.plotsquared.plot.flags.types.BooleanFlag;
import org.jetbrains.annotations.NotNull;

public class TamedInteractFlag extends BooleanFlag<TamedInteractFlag> {

    public static final TamedInteractFlag TAMED_INTERACT_TRUE = new TamedInteractFlag(true);
    public static final TamedInteractFlag TAMED_INTERACT_FALSE = new TamedInteractFlag(false);

    private TamedInteractFlag(boolean value) {
        super(value, Captions.FLAG_DESCRIPTION_TAMED_INTERACT);
    }

    @Override protected TamedInteractFlag flagOf(@NotNull Boolean value) {
        return value ? TAMED_INTERACT_TRUE : TAMED_INTERACT_FALSE;
    }

}
