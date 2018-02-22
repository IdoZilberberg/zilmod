package com.idoz.locationmod;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
    static final String MODID = "zilmod";
    static final String NAME = "ZIL Mod";
    static final String VERSION = "0.1";

    @SidedProxy(clientSide = "com.idoz.locationmod.ClientProxy", serverSide = "com.idoz.locationmod.CommonProxy")
    public static CommonProxy proxy;

    protected static final Minecraft mc = Minecraft.getMinecraft();

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("ZIL: Registering HUD Renderer");

        MinecraftForge.EVENT_BUS.register(HUDRenderer.instance);

    }
}
