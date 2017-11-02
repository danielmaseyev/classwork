package caveExplorer;

public class TreasureRoom extends NPCRoom {
	private int counter;
	public TreasureRoom(String description) {
		super(description);
		counter = 0;

	}
	public void enter() {
		super.enter(); 
		counter++;
		if(counter==1)
		{
			int money = CaveExplorer.inventory.getMoney();
			CaveExplorer.inventory.setMoney(money+1);
		}
	}
}
