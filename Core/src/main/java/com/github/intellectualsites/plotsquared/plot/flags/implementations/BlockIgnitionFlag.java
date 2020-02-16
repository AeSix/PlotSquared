package com.github.intellectualsites.plotsquared.plot.flags.implementations;

import com.github.intellectualsites.plotsquared.plot.config.Captions;
import com.github.intellectualsites.plotsquared.plot.flags.types.BooleanFlag;
import org.jetbrains.annotations.NotNull;

public class BlockIgnitionFlag extends BooleanFlag<BlockIgnitionFlag> {

    public static final BlockIgnitionFlag BLOCK_IGNITION_TRUE = new BlockIgnitionFlag(true);
    public static final BlockIgnitionFlag BLOCK_IGNITION_FALSE = new BlockIgnitionFlag(false);

    private BlockIgnitionFlag(boolean value) {
        super(value, Captions.FLAG_DESCRIPTION_BLOCK_IGNITION);
    }

    @Override protected BlockIgnitionFlag flagOf(@NotNull Boolean value) {
        return value ? BLOCK_IGNITION_TRUE : BLOCK_IGNITION_FALSE;
    }

}
