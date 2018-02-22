package com.idoz.locationmod;

/**
 * Created by Ido Zilberberg on 21/02/2018; Copyright (c) Ido Zilberberg
 */

public class InfoLine extends HUDModBase {

    /** Enables/Disables this Mod */
    public static boolean Enabled;

    /**
     * Toggles this Mod on or off
     * @return The state the Mod was changed to
     */
    public static boolean ToggleEnabled()
    {
        return Enabled = !Enabled;
    }

    public static boolean ShowBiome;
    public static boolean ShowCanSnow;

    /**  The padding string that is inserted between different elements of the Info Line */
    public static final String SPACER = " ";
    public static int infoLineLocX = 1;
    public static int infoLineLocY = 1;

    /*private static final int notificationDuration = 1200;	//measured in milliseconds
    private static long notificationTimer = 0;				//timer that goes from notificationDuration to 0
    private static long notificationStartTime;*/

    /** The notification string currently being rendered */
    public static String notificationMessage = "";

    /** The info line string currently being rendered */
    public static String infoLineMessage;


    /**
     * Renders the on screen message consisting of everything that gets put into the top let message area,
     * including coordinates and the state of things that can be activated
     */
    public static void RenderOntoHUD() {

        infoLineMessage = "";

        String fps = Fps.CalculateMessageForInfoLine();
        if (fps.length() > 0)
            fps += SPACER;
        infoLineMessage += fps;

        String playerInfo = PlayerInfo.CalculateMessageForInfoLine();
        playerInfo += SPACER;
        infoLineMessage += playerInfo;

        mc.fontRendererObj.drawStringWithShadow(infoLineMessage, infoLineLocX, infoLineLocY, 0xffffff);



    }


}
