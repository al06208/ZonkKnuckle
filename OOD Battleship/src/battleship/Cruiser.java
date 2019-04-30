package battleship;

public class Cruiser implements Ship{

	private Space[] spaces;
	public Cruiser(Space[] spaces){
		this.spaces = spaces;
	}

	@Override
	public int shipSize() {
		return 3;
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
