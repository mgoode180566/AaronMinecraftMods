package com.aaron.emerald;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.aaron.emerald.proxy.CommonProxy;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class AaronMods
{
    @SidedProxy(clientSide = References.CLIENTPROXY, serverSide = References.COMMONPROXY)
    public static CommonProxy proxy;
    public static final String MODID = References.MODID;
    public static final String Name = References.NAME;
    public static final String VERSION = References.VERSION;
    
    @EventHandler
    public static void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }
    @EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
