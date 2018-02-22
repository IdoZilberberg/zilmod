package com.idoz.locationmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;

/**
 * Created by Ido Zilberberg on 21/02/2018; Copyright (c) Ido Zilberberg
 */

public abstract class HUDModBase {

    protected static final Minecraft mc = Minecraft.getMinecraft();
    protected static final RenderItem itemRenderer = mc.getRenderItem();

    //We can't move the static variable Enabled to this base mod because then if one mod sets it to false
    //then ALL mods will be set to false


}
