package com.aaron.emerald.proxy;

import com.aaron.emerald.handlers.RegistryHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by michaelgoode on 16/09/2017.
 */

public class CommonProxy
{
    @SideOnly(Side.CLIENT)
    public void init(FMLInitializationEvent event) {
    }
    @SideOnly(Side.CLIENT)
    public void preInit(FMLPreInitializationEvent event) {
        RegistryHandler.Common();
    }
    @SideOnly(Side.CLIENT)
    public void postInit(FMLPostInitializationEvent event) {
    }
}
