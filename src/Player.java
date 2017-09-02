public class Player {
	// Variables
	private int x,y,length,score;

	// Constructors
	public Player() {}
	public Player(int x,int y, int length) {
		this.x = x;
		this.y = y;
		this.length = length;
	}

	// Methods

	/**
	 * Makes the player move based on user input
	 */
	public void userInteract() {
		// TODO
	}

	public boolean moveUp(){
		if(y > 0) {
			y++;
			return true;
		} else {
			return false;
		}
	}

	public boolean moveDown(){
		if(y < length - 1) {
			y++;
			return true;
		} else {
			return false;
		}
	}

	public boolean moveLeft(){
		if(x > 0) {
			x++;
			return true;
		} else {
			return false;
		}
	}

	public boolean moveRight(){
		if(x < length - 1) {
			x++;
			return true;
		} else {
			return false;
		}
	}
}
