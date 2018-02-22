package com.idoz.locationmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Ido Zilberberg on 21/02/2018; Copyright (c) Ido Zilberberg
 */

public class HUDRenderer {

    public static final HUDRenderer instance = new HUDRenderer();
    private static Minecraft mc = Minecraft.getMinecraft();


    /**
     * Event fired at various points during the GUI rendering process.
     * We render anything that need to be rendered onto the HUD in this method.
     *
     * @param event
     */
    @SubscribeEvent
    public void RenderGameOverlayEvent(RenderGameOverlayEvent event) {
        //render everything onto the screen
        if (event.type == RenderGameOverlayEvent.ElementType.TEXT) {
            InfoLine.RenderOntoHUD();
//            DistanceMeasurer.RenderOntoHUD();
//            DurabilityInfo.RenderOntoHUD();
//            PotionTimers.RenderOntoHUD();
//            HUDEntityTrackerHelper.RenderEntityInfo(event.partialTicks);	//calls other mods that need to render things on the HUD near entities
//            ItemSelector.RenderOntoHUD(event.partialTicks);
        } else if (event.type == RenderGameOverlayEvent.ElementType.DEBUG) {
//            AnimalInfo.RenderOntoDebugMenu();
        }


        //change how the inventories are rendered (this has to be done on every game tick)
        if (mc.currentScreen instanceof InventoryEffectRenderer) {
//            PotionTimers.DisableInventoryPotionEffects((InventoryEffectRenderer)mc.currentScreen);
        }
    }


}
