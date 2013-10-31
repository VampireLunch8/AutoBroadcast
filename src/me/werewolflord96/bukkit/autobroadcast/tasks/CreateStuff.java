package me.werewolflord96.bukkit.autobroadcast.tasks;

import me.werewolflord96.bukkit.autobroadcast.AutoBroadcast;

public class CreateStuff {
	
	public static void createPluginFolder() {
		// Preventing Errors
		try {
			AutoBroadcast.pluginFolder.mkdir();
		} catch (Exception e) {
			
		}
	}
}
