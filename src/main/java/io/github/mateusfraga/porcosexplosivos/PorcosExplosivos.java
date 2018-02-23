package io.github.mateusfraga.porcosexplosivos;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

public final class PorcosExplosivos extends JavaPlugin {
	
/*
 * Esse m�todo abaixo onEnable() sempre � chamado quando o plugin estiver
 * ativo e vai executar o c�digo descrito nele.
 */
	@Override
	public void onEnable() {
	
	 /*
	 * Com o plugin ativado temos que capturar os eventos que ocorreram no
	 * servidor. Isso ser� feito chamando o m�todo Listener na classe
	 * pluginEventHandler
	 * 
	 *  Para isso obtenho o nome do servidor principal do bukkit 'getServer'
	 *  
	 *  getServer - Retorna a inst�ncia do servidor que est� executando esse plugin
	 *  (defini��o da documenta��o)
	 *  
	 *  E tamb�m obtenho todas as 'adi��es nos plugins, eventos adicionais 
	 *  e fun�oes adicionais' com o m�todo getPluginManager
	 *  
	 *  getPluginManager - Obt�m o gerenciador de plugins para a interface com plugins.
	 *  (defini��o da documenta��o)
	 *  
	 *  e depois 'mando' o PluginManager registrar todos os eventos
	 *  em uma classe, registerEvents
	 *  
	 *  registerEvents - Registra todos os eventos na classe 'Listener' dada
	 *  (defini��o da documenta��o)
	 *  
	 *  Depois que ocorrer a explos�o tenho que 'desregistrar' o evento ou o plugin
	 *  para que n�o ocorra novas explos�es pelo execu��o deste plugin. Como?
	 *  com o m�todo onDisable()
	 *  no nosso caso faremos o unregister do plugin
	 */
	
		getServer().getPluginManager().registerEvents(new PluginEventHandler(), this);
				
	}
	
	@Override
	public void onDisable() {
		HandlerList.unregisterAll(this);	
	}
	
	
	
}
