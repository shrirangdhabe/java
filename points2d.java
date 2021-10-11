package points2d;

public class points2d {
private int x,y;
	
	//Defining the parameterized constructor
	public points2d(int x1,int y1) {
		x= x1;
		y=y1;
	}
	
	//Defining the display method
	public String getDetails()
	{
	   return "Point ("+x+","+y+")";
	}

}
