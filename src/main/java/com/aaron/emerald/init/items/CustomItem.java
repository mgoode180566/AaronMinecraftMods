package com.aaron.emerald.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by michaelgoode on 16/09/2017.
 */
public class CustomItem extends Item
{
    public CustomItem(String name)
    {
        super();
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(CreativeTabs.MATERIALS);
    }

}
