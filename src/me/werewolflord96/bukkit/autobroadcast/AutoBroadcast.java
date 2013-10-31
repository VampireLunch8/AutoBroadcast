package me.werewolflord96.bukkit.autobroadcast;

import java.io.File;

import me.werewolflord96.bukkit.autobroadcast.tasks.CreateStuff;

import org.bukkit.plugin.java.JavaPlugin;

public class AutoBroadcast extends JavaPlugin {
	
	public static File pluginFolder = new File("plugins/AutoBroadcast/");
	public static String pluginPrefix = "[AutoBroadcast] ";
	
	@Override
	public void onDisable() {
		this.getLogger().info(pluginPrefix + "Disabled.");
	}
	
	@Override
	public void onEnable() {
		// Also Displays Version
		this.getLogger().info(pluginPrefix + "Enabled.");
		
		// Generates Folder
		if (!pluginFolder.exists()) {
			CreateStuff.createPluginFolder();
		}
	}
}
