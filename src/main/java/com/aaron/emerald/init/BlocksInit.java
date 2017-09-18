package com.aaron.emerald.init;

import com.aaron.emerald.References;
import com.aaron.emerald.init.blocks.CustomBlock;
import com.aaron.emerald.init.items.CustomItem;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
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
public class BlocksInit
{
    private static List<CustomBlock> blocks = new ArrayList<>();

    public static void init()
    {
        blocks.add(new CustomBlock(References.SAUSAGE_BLOCK_NAME, 2.0f, 4.0f, 2));
    }

    @SideOnly(Side.CLIENT)
    public static void register()
    {
        for( CustomBlock block : blocks) {
            registerBlock(block);
        }
    }

    @SideOnly(Side.CLIENT)
    private static void registerBlock(Block block)
    {
        ForgeRegistries.BLOCKS.register(block);
        block.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(itemBlock);
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
                new ModelResourceLocation(
                        new ResourceLocation(itemBlock.getRegistryName().toString()), "inventory"));
    }
}
