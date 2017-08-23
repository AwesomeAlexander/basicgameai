package project;

public class Tile {
	private int amount;
	
	public Tile() {
		
	}
	
	public void setAmount(int newAmount){
		amount = newAmount;
	}
	
	public void tileAccessed(){
		amount = 0;
	}
	
	public void setRandAmount(int min, int max) {
		this.setAmount((int) (Math.random()*(max-1) + min));
	}
	
	public int getAmount(){
		return amount;		
	}
}
