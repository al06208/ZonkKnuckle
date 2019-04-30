package battleship;

public class Destroyer implements Ship {
	private Space[] spaces;
	public Destroyer(Space[] spaces){
		this.spaces = spaces;
	}

	@Override
	public int shipSize() {
		return 2;
	}

	@Override
	public Space[] getSpaces() {
		
		return spaces;
	}

	

	@Override
	public boolean isDestroyed() {
		for(Space space : spaces){
			if(!space.isHit()){
				return false;
			}
		}
			return true;
	}
		

}
