package io.github.mateusfraga.porcosexplosivos;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

public final class PorcosExplosivos extends JavaPlugin {
	
/*
 * Esse método abaixo onEnable() sempre é chamado quando o plugin estiver
 * ativo e vai executar o código descrito nele.
 */
	@Override
	public void onEnable() {
	
	 /*
	 * Com o plugin ativado temos que capturar os eventos que ocorreram no
	 * servidor. Isso será feito chamando o método Listener na classe
	 * pluginEventHandler
	 * 
	 *  Para isso obtenho o nome do servidor principal do bukkit 'getServer'
	 *  
	 *  getServer - Retorna a instância do servidor que está executando esse plugin
	 *  (definição da documentação)
	 *  
	 *  E também obtenho todas as 'adições nos plugins, eventos adicionais 
	 *  e funçoes adicionais' com o método getPluginManager
	 *  
	 *  getPluginManager - Obtém o gerenciador de plugins para a interface com plugins.
	 *  (definição da documentação)
	 *  
	 *  e depois 'mando' o PluginManager registrar todos os eventos
	 *  em uma classe, registerEvents
	 *  
	 *  registerEvents - Registra todos os eventos na classe 'Listener' dada
	 *  (definição da documentação)
	 *  
	 *  Depois que ocorrer a explosão tenho que 'desregistrar' o evento ou o plugin
	 *  para que não ocorra novas explosões pelo execução deste plugin. Como?
	 *  com o método onDisable()
	 *  no nosso caso faremos o unregister do plugin
	 */
	
		getServer().getPluginManager().registerEvents(new PluginEventHandler(), this);
				
	}
	
	@Override
	public void onDisable() {
		HandlerList.unregisterAll(this);	
	}
	
	
	
}
