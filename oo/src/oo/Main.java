package oo;

public class Main {

	public static void main(String[] args) {
		/*
		 * Iniciando Game
		 */
		System.out.println("Game Start");
		
		/*
		 * Iniciando Jogador
		 * Iniciando Inimigo
		 */
		Player player = new Player();
		Enemy enemy = new Enemy();
		
		player.iniciarPlayer();
		enemy.iniciarEnemy();
		
		
	}
}
