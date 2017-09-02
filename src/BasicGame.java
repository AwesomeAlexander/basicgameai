public class BasicGame {
	private Tile[][] grid;

	public BasicGame() {}

	public void createGrid(int length,int min,int max){
		grid = new Tile[length][length];
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				grid[i][j] = new Tile();
				grid[i][j].setRandAmount(min, max);
			}
		}
	}
	public int calcTotalScore(){
		int length = grid.length;
		int totalScore = 0;
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				totalScore += grid[i][j].getAmount();
			}
		}
		return totalScore;
	}

	public void dispGrid() {
		int length = grid.length;
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				System.out.print(" | " + grid[i][j].getAmount());
			}
			System.out.println(" |");
		}
	}
}
