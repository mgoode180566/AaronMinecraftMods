package com.aaron.emerald.init;

import com.aaron.emerald.References;
import com.aaron.emerald.init.items.CustomItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by michaelgoode on 16/09/2017.
 */
public class ItemsInit
{
    private static List<CustomItem> items = new ArrayList<CustomItem>();

    public static void init()
    {
        items.add(new CustomItem(References.EMERALD_NUGGET_NAME));
        items.add(new CustomItem(References.DIAMOND_NUGGET_NAME));
        items.add(new CustomItem(References.COPPER_NUGGET_NAME));
    }

    @SideOnly(Side.CLIENT)
    public static void register()
    {
        for( CustomItem item : items) {
            registerItem(item);
        }
    }

    @SideOnly(Side.CLIENT)
    private static void registerItem(Item item)
    {
        ForgeRegistries.ITEMS.register(item);
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(
                        new ResourceLocation(item.getRegistryName().toString()), "inventory"));
    }
}
