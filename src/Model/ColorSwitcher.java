package Model;

import Model.Settings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColorSwitcher {

    private static final Map<String, String> COLORS = new HashMap<>();
    {
        COLORS.put("BLACK", "\u001B[30m");
        COLORS.put("RED", "\u001B[31m");
        COLORS.put("GREEN", "\u001B[32m");
        COLORS.put("YELLOW", "\u001B[33m");
        COLORS.put("BLUE", "\u001B[34m");
        COLORS.put("CYAN", "\u001B[36m");
        COLORS.put("WHITE", "\u001B[37m");
    }
    Settings settings;

    public ColorSwitcher(Settings settings) {
        this.settings = settings;
    }

    public List<String> getColors(){
        return new ArrayList<>(COLORS.keySet());
    }
    public boolean setColor(String color){
        if (COLORS.containsKey(color)) {
            settings.setCurrentColor(COLORS.get(color));
            return true;
        }
        else
            return false;
    }
    public String getDefaultColor(){
        return COLORS.get("WHITE");
    }

}
