package caveExplorer;

public class CaveRoom {

	private String description;
	private String directions;
	private String contents;
	private String defaultContents;
	
	private CaveRoom[] borderingRooms;
	private Door[] doors;
	
	
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;
	
	public CaveRoom(String description) {
		this.description = description;
		setDefaultContents(" ");
		contents = defaultContents;
		borderingRooms = new CaveRoom[4];
		doors = new Door[4];
		setDirections();
	}

	private void setDirections()
	{
		directions = "";
		boolean doorFound = false;
		for(int i =0;i < doors.length;i++)
		{
			if(doors[i] != null)
			{
				doorFound = true;
				directions += "There is a "+doors[i].getDescription() +" to the "+ toDirection(i)+"."+doors[i].getDetails();
			}
		}
		if(!doorFound)
		{
			directions = "There is no way out. You are trapped in this rooms";
		}
		
	}
	
	public static String toDirection(int dir)
	{
		String[] direction = {"The North","The East", "The South", "The West"};
		return direction[dir];
	}
	public void enter()
	{
		contents = "X";
	}
	public void leave()
	{
		contents = defaultContents;
	}


	public void setConnection(int direction, CaveRoom anotherRoom, Door door)
	{
		addRoom(direction, anotherRoom, door);
		anotherRoom.addRoom(oppositeDirection(direction), this, door);
	}
	public void addRoom(int dir, CaveRoom caveRoom, Door door) 
	{	
		borderingRooms[dir] = caveRoom;
		doors[dir] = door;
		setDirections();
	}
	public void interpretInput(String input)
	{
		while(!isValid(input))
		{
			System.out.println("You can only enter 'w','a','s','d'.");
			input = CaveExplorer.in.nextLine();
		}
		goToRoom(dir.indexOf);
	}
	private boolean isValid(String input) {
		
		return input.compareTo("w")>=0 ||input.compareTo("a")>=0 ||input.compareTo("s")>=0 || input.compareTo("d")>=0;
	
		
	}
	public static void setUpCaves()
	{
		CaveExplorer.caves = new CaveRoom[5][5];
		CaveRoom[][] c = CaveExplorer.caves;
		for(int row = 0; row < c.length;row++)
		{
			for(int col = 0; col < c[row].length; col++)
			{
				c[row][col] = new CaveRoom("This cave has coordinates "+row+","+col);
			}
		}
		//3. Replace some default rooms with custom rooms
		
		//4. set starting rooms
		CaveExplorer.currentRoom = c[0][1];
		CaveExplorer.currentRoom.enter();
		
		c[0][1].setConnection(SOUTH, c[1][1], new Door());
		c[1][1].setConnection(EAST, c[1][2], new Door());
		
		
	}

	public void goToRoom(int direction)
	{
		if(borderingRooms[direction] !=null && doors[direction] !=null && doors[direction].isOpen())
		{
			CaveExplorer.currentRoom.leave();
			CaveExplorer.currentRoom = borderingRooms[direction];
			CaveExplorer.currentRoom.enter();
			CaveExplorer.inventory.updateMap();
			
		}else {
			System.err.println("You cant do that!");
		}
	}
	public static int oppositeDirection(int dir)
	{
		int[] position = {2,3,0,1};
		return position[dir];
	}
	public void setDefaultContents(String defaultContents) {
		this.defaultContents = defaultContents;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDirections() {
		return directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

}
