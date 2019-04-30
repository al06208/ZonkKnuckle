package battleship;

public class ExShip implements Ship {

	Space origin;
	Space[] array;

	//Orig is the ship's origin space, arr is the array of spaces the ship is over
	public ExShip(Space orig, Space[] arr) {
		this.origin = orig;
		
		orig.addShip(this);
		this.array = arr;
	}
	@Override
	public int shipSize() {
		return 1;
	}

	@Override
	public Space[] getSpaces() {
		return array;
	}

	public Space originSpace() {
		return origin;
	}
	@Override
	public boolean isDestroyed() {
		boolean dead = true; //assumes the ship is dead
		for(Space s:array) { //iterates over all the spaces
			if(!s.isHit) {
				dead=false;
			}
		}
		return dead;
	}

}
