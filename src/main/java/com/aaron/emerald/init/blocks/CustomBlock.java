package com.aaron.emerald.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


/**
 * Created by michaelgoode on 16/09/2017.
 */
public class CustomBlock extends Block
{
    public CustomBlock(String name, float hardness, float resistance, int harvestLevel)
    {
        super(Material.ROCK);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setCreativeTab(CreativeTabs.MATERIALS);
        this.setHarvestLevel("pickaxe", 2);
    }

}
