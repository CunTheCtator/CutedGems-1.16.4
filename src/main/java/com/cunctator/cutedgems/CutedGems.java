package com.cunctator.cutedgems;

import com.cunctator.cutedgems.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CutedGems.MOD_ID)
public class CutedGems {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "cutedgems";
    public static final ItemGroup CUTED_GEMS_GROUP = new CutedGemsGroup("cutedgemstab");

    public CutedGems() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::setup);

        ItemInit.ITEMS.register(bus);
        //HardenedDiamondCuters.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    public static class CutedGemsGroup extends ItemGroup {

        public CutedGemsGroup(String label) {
            super(label);
        }

        @Override
        public ItemStack createIcon() {
            return ItemInit.CUTED_DIAMOND.get().getDefaultInstance();
        }
    }
}
