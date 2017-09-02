import java.util.Random;

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
			//int range = max - min + 100;
			Random r = new java.util.Random();

			int currRand = r.nextInt(max + 1) + min;
		this.setAmount(currRand);
	}

	public int getAmount(){
		return amount;
	}
}
