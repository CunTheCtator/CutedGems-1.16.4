package com.cunctator.cutedgems.core.init;

import com.cunctator.cutedgems.CutedGems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.rmi.registry.Registry;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CutedGems.MOD_ID);

    public static final RegistryObject<Item> CUTED_DIAMOND = ITEMS.register("cuted_diamond", () -> new Item(new Item.Properties().group(CutedGems.CUTED_GEMS_GROUP).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CUTED_EMERALD = ITEMS.register("cuted_emerald", () -> new Item(new Item.Properties().group(CutedGems.CUTED_GEMS_GROUP).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> CUTED_LAPIS = ITEMS.register("cuted_lapis", () -> new Item(new Item.Properties().group(CutedGems.CUTED_GEMS_GROUP).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> CUTED_REDSTONE = ITEMS.register("cuted_redstone", () -> new Item(new Item.Properties().group(CutedGems.CUTED_GEMS_GROUP).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> HARDENED_DIAMOND = ITEMS.register("hardened_diamond", () -> new Item(new Item.Properties().group(CutedGems.CUTED_GEMS_GROUP)));
	public static final RegistryObject<Item> HARDENED_DIAMOND_BLANK = ITEMS.register("hardened_diamond_blank", () -> new Item(new Item.Properties().group(CutedGems.CUTED_GEMS_GROUP)));

    // /*
	public static final RegistryObject<Item> HARDENED_DIAMOND_CUTERS = ITEMS.register("hardened_diamond_cuters", () -> new ItemHardenedDiamondCuters());

	public static class ItemHardenedDiamondCuters extends Item {
		public ItemHardenedDiamondCuters() {
			super(new Properties().group(CutedGems.CUTED_GEMS_GROUP).maxDamage(256));
		}

		@Override
		public boolean hasContainerItem() {
			return true;
		}

		@Override
		public ItemStack getContainerItem(ItemStack itemstack) {
			ItemStack retval = new ItemStack(this);
			retval.setDamage(itemstack.getDamage() + 1);
			if (retval.getDamage() >= retval.getMaxDamage()) {
				return ItemStack.EMPTY;
			}
			return retval;
		}
	}
	//*/
}
