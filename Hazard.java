package mc.hazard;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Hazard extends JavaPlugin {
	
	Logger logger = Bukkit.getLogger();
	
	public void onEnable() {
		logger.info("[Hazard] Enabled");
	}
	
	public void onDisable() {
		logger.info("[Hazard] Disabled");
	}

}
