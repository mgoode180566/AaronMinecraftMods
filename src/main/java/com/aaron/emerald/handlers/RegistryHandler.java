package com.aaron.emerald.handlers;

import com.aaron.emerald.init.BlocksInit;
import com.aaron.emerald.init.ItemsInit;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by michaelgoode on 16/09/2017.
 */
public class RegistryHandler
{
    @SideOnly(Side.CLIENT)
    public static void Client()
    {
        ItemsInit.register();
        BlocksInit.register();
    }

    public static void Common()
    {
        ItemsInit.init();
        BlocksInit.init();
    }

}
