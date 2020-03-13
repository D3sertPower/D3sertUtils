package me.d3sertoff.d3sertsanimatedemotes;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		
		getCommand("discord").setExecutor(new Comandos());
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN+"Plugin Funcionando!");
	}
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"Plugin Desabilitado");
	}
	
}

	
	
	
	
	

	
