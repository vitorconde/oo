package oo;

public class Main extends TesteAbstract{

	public static void main(String[] args) {
		/*
		 * Iniciando Game
		 
		* System.out.println("Game Start");
		
		
		 * Iniciando Jogador
		 * Iniciando Inimigo
		 
		* Player player = new Player();
		* Enemy enemy = new Enemy();
		
		* player.iniciarPlayer();
		* enemy.iniciarEnemy();
		
		new Main().instanceMain2();
		System.out.println("Inner Class");
		*/		
		new TesteAbstract() {
		};
		
		
	}
	
	public void iniciarJogo() {
		
	}
	
	public void chamarMetodoAbstract() {
		this.iniciarJogo();
		this.instanceMain2();
	}
	
	public void instanceMain2() {
		new Main2().print();
	}
	
	private class Main2{
		public void print() {
			System.out.println("Chamando meu método");
		}
	}
	
}
