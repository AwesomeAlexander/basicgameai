package project;

public class Player {
	// Variables
	private int x,y,score;
	
	// Constructors
	public Player() {}
	public Player(int x,int y) {
		this.x = x;
		this.y = y;
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
			x++;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean moveDown(){
		if(y < run.LENGTH - 1) {
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
		if(x < run.LENGTH - 1) {
			x++;
			return true;
		} else {
			return false;
		}
	}
}
