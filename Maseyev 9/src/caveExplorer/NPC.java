package caveExplorer;

public class NPC {
	private CaveRoom[][] floor;
	private int currentRow;
	private int currentCol;
	private NPCRoom currentRoom;
	
	private boolean active;
	private String activeDescription;
	private String inactiveDescription;
	public NPC() {
		this.floor = CaveExplorer.caves;
		this.activeDescription = "there is a person standing in the room,"+ " waiting to talk to you. Press 'e' to talk.";
		this.inactiveDescription = "The person you spoke to earlier is " + "standing here,";
		this.currentCol = -1;
		this.currentRow = -1;
		currentRoom = null;
		active = true;
	}

	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}

	public void interact() {
		// TODO Auto-generated method stub
		
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getInactiveDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSymbol() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
