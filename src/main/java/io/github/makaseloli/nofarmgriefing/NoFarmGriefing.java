package io.github.makaseloli.nofarmgriefing;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.level.BlockEvent;

@Mod(NoFarmGriefing.MOD_ID)
public final class NoFarmGriefing {
    public static final String MOD_ID = "nofarmgriefing";

    public NoFarmGriefing(IEventBus modEventBus, ModContainer modContainer) {
        NeoForge.EVENT_BUS.addListener(NoFarmGriefing::onFarmlandTrample);
    }

    private static void onFarmlandTrample(BlockEvent.FarmlandTrampleEvent event) {
        event.setCanceled(true);
    }
}
