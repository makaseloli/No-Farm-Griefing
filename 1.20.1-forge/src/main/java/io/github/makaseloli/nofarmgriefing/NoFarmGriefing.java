package io.github.makaseloli.nofarmgriefing;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public final class NoFarmGriefing {
    public NoFarmGriefing() {
        MinecraftForge.EVENT_BUS.addListener(NoFarmGriefing::onFarmlandTrample);
    }

    private static void onFarmlandTrample(BlockEvent.FarmlandTrampleEvent event) {
        event.setCanceled(true);
    }
}
