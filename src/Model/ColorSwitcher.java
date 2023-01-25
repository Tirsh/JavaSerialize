package Model;

import Model.Settings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColorSwitcher {

    private static final Map<String, String> COLORS = new HashMap<>();
    {
        COLORS.put("BLACK", "\033[30m");
        COLORS.put("RED", "\033[31m");
        COLORS.put("GREEN", "\033[32m");
        COLORS.put("YELLOW", "\033[33m");
        COLORS.put("BLUE", "\033[34m");
        COLORS.put("CYAN", "\033[36m");
        COLORS.put("WHITE", "\033[37m");
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
