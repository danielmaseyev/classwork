
package arrays2D;

public class Array2DSampler 
{
	private String[][] pic;
	
	public Array2DSampler() 
	{
		pic = new String[10][20];
		print(pic);
	}

	private void print(String[][] pic2) {
		for(int row = 0; row < pic.length;row++)
		{
			for(int col = 0; col<pic[row].length;col++)
			{
				System.out.print(pic[row][col]);
			}
			//line break
			System.out.println("");
		}
		for(String[] row:pic)
		{
			for(String col:row)
			{
				System.out.print(col);
			}
			System.out.println("");
		}
		
	}
	

}
