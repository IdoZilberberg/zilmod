package com.idoz.locationmod;

/**
 * Created by Ido Zilberberg on 21/02/2018; Copyright (c) Ido Zilberberg
 */

public class PlayerInfo extends HUDModBase
{

    /** Enables/Disables this Mod */
    public static boolean Enabled = true;

    /**
     * Toggles this Mod on or off
     * @return The state the Mod was changed to
     */
    public static boolean ToggleEnabled()
    {
        return Enabled = !Enabled;
    }

    public static String CalculateMessageForInfoLine()
    {
        if (PlayerInfo.Enabled)
        {
            return "Location: " +
                    mc.thePlayer.getPosition().getX() + ", " +
                    mc.thePlayer.getPosition().getY() + ", " +
                    mc.thePlayer.getPosition().getZ() + ", " +
                    " (" + mc.thePlayer.getHorizontalFacing().toString() + ")";
        }
        else
        {
            return "";
        }
    }
}
