package com.aaron.emerald.proxy;

import com.aaron.emerald.handlers.RegistryHandler;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by michaelgoode on 16/09/2017.
 */

public class ClientProxy extends CommonProxy
{
    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        RegistryHandler.Client();
    }
    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }

}
