package ex2;

public class Game {
	
	//Constantes
	private static final String RIGHT = "Derecha";
	private static final String LEFT = "Izquierda";
	private static final String UP = "Arriba";
	private static final String DOWN = "Abajo";
	
	private Player player1 = new Player();
	
	public void movement(String m) {
		switch (m.toLowerCase()) {
			case RIGHT:
				player1.setX(player1.getX() + 1);
				break;
			case LEFT:
				player1.setX(player1.getX() - 1);
				break;
			case UP:
				player1.setY(player1.getY() - 1);
				break;
			case DOWN:
				player1.setY(player1.getY() + 1);
				break;
			default:
				System.out.println("Movimiento no reconocido.");
				break;
		}
		System.out.println(player1.getX() + ", " + player1.getY());
	}
}
