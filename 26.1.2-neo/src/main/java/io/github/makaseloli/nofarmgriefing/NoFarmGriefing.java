package io.github.makaseloli.nofarmgriefing;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.level.BlockEvent;

@Mod(Constants.MOD_ID)
public final class NoFarmGriefing {
    public NoFarmGriefing(IEventBus modEventBus, ModContainer modContainer) {
        NeoForge.EVENT_BUS.addListener(NoFarmGriefing::onFarmlandTrample);
    }

    private static void onFarmlandTrample(BlockEvent.FarmlandTrampleEvent event) {
        event.setCanceled(true);
    }
}
