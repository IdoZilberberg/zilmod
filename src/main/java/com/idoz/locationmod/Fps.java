package com.idoz.locationmod;

public class Fps extends HUDModBase
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

    public static String currentFpsStr = "0";

    public static String CalculateMessageForInfoLine()
    {
        if (Fps.Enabled)
        {
            currentFpsStr = mc.debug.substring(0, mc.debug.indexOf(' '));
            return "FPS: " + currentFpsStr;
        }
        else
        {
            return "";
        }
    }
}
