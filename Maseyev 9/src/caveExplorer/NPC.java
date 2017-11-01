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
		return active;
	}

	public void interact() {
		CaveExplorer.print("Lets interact! type 'bye' to stop");
		String s = CaveExplorer.in.nextLine();
		while(!s.equalsIgnoreCase("bye"))
		{
			CaveExplorer.print("Yeah... I dont do a whole lot.");
			s = CaveExplorer.in.nextLine();
		}
		CaveExplorer.print("Later, friend");
		active = false;
{
	
}
		
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return activeDescription;
	}

	public String getInactiveDescription() {
		// TODO Auto-generated method stub
		return inactiveDescription;
	}

	public String getSymbol() {
		// TODO Auto-generated method stub
		return "P";
	}

	public void setPosition(int row, int col)
	{
		if(row >= 0 && row< floor.length && col >= 0 && col < floor[row].length && floor[row][col] instanceof NPCRoom)
		{
			if(currentRoom != null)
			{
				currentRoom.leaveNPC();
			}
			currentRow = row;
			currentCol = col;
			currentRoom = (NPCRoom)floor[row][col];
			currentRoom.enterNPC(this);
		}
		
		
	}

	public void autoMove() {
		if(active)
		{
			int[] move = calculateMove();
			int newRow = currentRow + move[0];
			int newCol = currentRow + move[1];
			setPosition(newRow, newCol);
		}
		
	}

	private int[] calculateMove() {
		int[][] possibleMoves = {{-1,0},{0,1},{1,0},{0,-1}};
		int index = 
		return null;
	}
	
}
