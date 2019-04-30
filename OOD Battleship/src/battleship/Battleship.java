package battleship;

public class Battleship implements Ship {
	private Space[] spaces;
	public Battleship(Space[] spaces){
		this.spaces = spaces;
	}

	@Override
	public int shipSize() {
		return 4;
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
