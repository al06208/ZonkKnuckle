package battleship;

public class AttackCommand implements Command{
	Main weirdoDemo;
	Main target;
	int xCord;
	int yCord;
	
	public AttackCommand(Main target, int x, int y) {
		this.target = target;
		this.xCord = x;
		this.yCord = y;
	}
	
	//Hits the targeted space, checks for a win, and responds
	public String execute() {
		String result = target.boardPlayerState[xCord][yCord].hit();
		target.redrawBoards();
		boolean lose = target.doILose();
		if(lose) {
			target.setTurn(false);
			target.setLabel("You lose! Better luck next time.");
			return "0|0|win|response|from"+target.toString();
		}
		else {
			target.setTurn(true);
			return result;
		}	
	}

}
