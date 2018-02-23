package io.github.mateusfraga.porcosexplosivos;

import org.bukkit.entity.Pig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;


public class PluginEventHandler implements Listener {
	/*
	 * Essa classe (EventHandler) faz o monitoramento de eventos e
	 * implementa a interface Listener que 'escuta ou captura' os eventos 
	 * ocorridos no minecraft.
	 * 
	 * Nesta classe vou definir qual evento quero capturar/escutar
	 * 
	 * Neste momento procuro no bukkit.jar o elemento porco que na
	 * verdade � um animal e ou tamb�m uma entidade viva no minecraft.
	 * ent�o tenho 'org.bukkit.event.entity'
	 * 
	 * ou
	 * 
	 * 'org.bukkit.event.player' que vai monitorar o jogador e passar 
	 * a informa��o de quando ele clicou com o botao direito
	 * 
	 * o m�todo ou fun��o criado abaixo 'quando...' vai interagir
	 * quando um player clicar com o bot�o direito na entidade
	 * 
	 * 'PlayerInteractAtEntityEvent' - Representa um evento que � "chamado" quando um jogador clica 
	 * com o bot�o direito em uma entidade.
	 *  
	 * o 'event' � o objeto/vari�vel criado que vamos manipiular.
	 * Ele vai receber esse um valor, tipo um m�todo setter.
	 * 
	 * por fim para executar o plugin tenho que colocar uma anota��o
	 * que vai se chamar @EventHandler. Essa anota��o vai dizer
	 * ao bukkit para ele ser executado
	 * 
	 * 'event.getRightClicked()' - vai obter o momento em que o
	 * player clicar com o bot�o direito na entidade porco. 'if' vai
	 * confirmar se � um porco
	 * ('instanceof' pig)
	 * se clicar vamos explodir o porco
	 * a vari�vel pig (que foi uma vari�vel 'for�ada') receber� o click direito
	 * 
	 */
	
	@EventHandler	
	void quandoJogadorClicarComBotaoDireitoEmEntidade(PlayerInteractAtEntityEvent event) 
	{
		if(event.getRightClicked() instanceof Pig) {
			Pig pig = (Pig) event.getRightClicked();
			//agora vou criar um explosao no local do porco
			pig.getWorld().createExplosion(pig.getLocation(), 20f, true);		
		}
		return;
		
	}

}
