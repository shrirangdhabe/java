package points2d;
import java.util.Scanner;

public class testpoint {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of point1 : "); //Taking the value of point 1
		int p1x,p1y;
		p1x = sc.nextInt();
		p1y = sc.nextInt();
		points2d pt = new points2d(p1x,p1y);
		
		
		System.out.println(pt.getDetails());
		
		System.out.println("Enter the values of Point2 : "); //Taking the value of point 1
		int p2x,p2y;
		p2x = sc.nextInt();
		p2y = sc.nextInt();
		points2d pt1 = new points2d(p2x,p2y);
		
		
		System.out.println(pt1.getDetails());
	}

}
