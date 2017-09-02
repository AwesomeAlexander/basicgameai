public class Run {
	public static final int MIN = 0;
	public static final int MAX = 3;
	public static final int LENGTH = 5;

	public static void main(String[] args) {
		BasicGame game = new BasicGame();
		Player person = new Player();

		game.createGrid(LENGTH, MIN, MAX);
		game.dispGrid();
	}
}
