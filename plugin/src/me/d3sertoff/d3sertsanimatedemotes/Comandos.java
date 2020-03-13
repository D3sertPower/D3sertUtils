package me.d3sertoff.d3sertsanimatedemotes;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Comandos implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender,  Command cmd,  String lb, String[] args) {
        if(!(sender instanceof Player)) {   	
        	sender.sendMessage("§2 Apenas para Jogadores.");
        	return true;
        	
        	
        	
        }
        
        Player p = (Player)sender;
        if(!p.hasPermission("d3sert.usar")) {
        	p.sendMessage("§c Sem permissão");
        	return true;
       
        }
        
        if(cmd.getName().equalsIgnoreCase("discord")) {
           p.sendMessage("§dDiscord:§b https://discord.gg/F2cteSx");
           return true;
        }      
		return false;
	}
  

}
