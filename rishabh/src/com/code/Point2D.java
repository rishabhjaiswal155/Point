package com.code;
import java.lang.Math;
public class Point2D {
	private int x,y;
	public Point2D(int x, int y) {
		System.out.println("--------------paremetreize Constructor invoked-------");
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point x=" + x + ", y=" + y ;
	}

	public boolean isEqual(Point2D pobj)
	{
		if(this.x==pobj.x && this.y==pobj.y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public double calculateDistance(Point2D pobj)
	{
		return d;
		
	}
	public void display()
	{
		System.out.println("Point X="+x+"point Y= "+y);
	}

}
